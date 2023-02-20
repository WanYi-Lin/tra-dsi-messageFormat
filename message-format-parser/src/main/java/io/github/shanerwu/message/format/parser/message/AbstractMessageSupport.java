package io.github.shanerwu.message.format.parser.message;

import io.github.shanerwu.message.format.core.MessageFormatHelper;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Slf4j
public abstract class AbstractMessageSupport<S extends MessageFormatSupport, T extends MessageFormatSupport> {

    @Getter
    private S header;

    @Getter
    private T body;

    public AbstractMessageSupport(String message) {
        Class<S> headerClass = this.getHeaderClass();
        Class<T> bodyClass = this.getBodyClass();
        int headerLength = this.getHeaderLength(headerClass);
        this.header = MessageFormatHelper.parse(message.substring(0, headerLength), headerClass);
        this.body = this.parseBody(message.substring(headerLength), bodyClass);
    }

    private T parseBody(String bodyMessage, Class<T> bodyClass) {
        if (StringUtils.isBlank(bodyMessage)) {
            bodyClass = (Class<T>) EmptyBody.class;
        }
        return MessageFormatHelper.parse(bodyMessage, bodyClass);
    }

    @SuppressWarnings("unchecked")
    private Class<S> getHeaderClass() {
        Class<?> clazz = getClass();
        Type genType = clazz.getGenericSuperclass();
        Type[] actualTypes = ((ParameterizedType) genType).getActualTypeArguments();
        return (Class<S>) actualTypes[0];
    }

    @SuppressWarnings("unchecked")
    private Class<T> getBodyClass() {
        Class<?> clazz = getClass();
        Type genType = clazz.getGenericSuperclass();
        Type[] actualTypes = ((ParameterizedType) genType).getActualTypeArguments();
        return (Class<T>) actualTypes[1];
    }

    private int getHeaderLength(Class<?> header) {
        int length = 0;
        try {
            MessageFormatSupport messageFormatSupport = (MessageFormatSupport) header.newInstance();
            length = messageFormatSupport.getLength();
        } catch (InstantiationException | IllegalAccessException e) {
            log.error(e.getMessage(), e);
        }
        return length;
    }

}

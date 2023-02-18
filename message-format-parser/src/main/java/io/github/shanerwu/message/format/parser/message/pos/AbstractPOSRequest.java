package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatHelper;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;
import lombok.Getter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Getter
public abstract class AbstractPOSRequest<T extends MessageFormatSupport> extends AbstractMessageSupport{

    private static final int REQUEST_HEADER_TOTAL_LENGTH = 34;

    protected POSReqHeader header;

    protected T body;

    protected String stringifyResult;

    protected AbstractPOSRequest(String businessData) {
        this.header = MessageFormatHelper.parse(businessData.substring(0, REQUEST_HEADER_TOTAL_LENGTH), POSReqHeader.class);
        this.body = MessageFormatHelper.parse(businessData.substring(REQUEST_HEADER_TOTAL_LENGTH), getBodyClass());
        this.header.setRequestLength(this.header.getLength() + this.body.getLength());
        this.stringifyResult = businessData;
    }

    @SuppressWarnings("unchecked")
    private Class<T> getBodyClass() {
        Class<?> clazz = getClass();
        Type genType = clazz.getGenericSuperclass();
        Type[] actualTypes = ((ParameterizedType) genType).getActualTypeArguments();
        return (Class<T>) actualTypes[0];
    }

}

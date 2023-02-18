package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatHelper;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public abstract class AbstractPOSResponse<T extends MessageFormatSupport> extends AbstractMessageSupport{

    protected POSResHeader header;

    protected T body;

    protected String stringifyResult;

    protected AbstractPOSResponse(POSResHeader header, T body) {
        this.header = header;
        this.body = body;
        if (this.body != null) {
            this.header.setResponseLength(this.header.getLength() + this.body.getLength());
            this.stringifyResult = MessageFormatHelper.stringify(this.header) + MessageFormatHelper.stringify(this.body);
        } else {
            this.header.setResponseLength(this.header.getLength());
            this.stringifyResult = MessageFormatHelper.stringify(this.header);
        }
    }

}

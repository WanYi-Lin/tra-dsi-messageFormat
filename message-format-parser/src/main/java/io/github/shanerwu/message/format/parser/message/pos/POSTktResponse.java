package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("POSTktResponse")
public class POSTktResponse extends AbstractMessageSupport<POSResHeader, POSTktResponseBody> {

    public POSTktResponse(String message) {
        super(message);
    }

}

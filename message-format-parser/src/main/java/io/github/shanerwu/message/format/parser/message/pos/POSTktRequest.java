package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("POSTktRequest")
public class POSTktRequest extends AbstractMessageSupport<POSReqHeader, POSTktRequestBody> {

    public POSTktRequest(String message) {
        super(message);
    }

}

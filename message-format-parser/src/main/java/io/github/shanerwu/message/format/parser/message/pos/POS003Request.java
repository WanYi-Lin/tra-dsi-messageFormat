package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("POS003Request")
public class POS003Request extends AbstractMessageSupport<POSReqHeader,POS003RequestBody> {

    public POS003Request(String message) {
        super(message);
    }

}

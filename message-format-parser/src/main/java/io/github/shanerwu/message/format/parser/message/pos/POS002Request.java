package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("POS002Request")
public class POS002Request extends AbstractMessageSupport<POSReqHeader, POS002RequestBody> {

    public POS002Request(String message) {
        super(message);
    }

}

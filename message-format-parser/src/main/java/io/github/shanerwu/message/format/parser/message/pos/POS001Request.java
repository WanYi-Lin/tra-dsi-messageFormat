package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("POS001Request")
public class POS001Request extends AbstractMessageSupport<POSReqHeader, POS001RequestBody> {

    public POS001Request(String message) {
        super(message);
    }

}

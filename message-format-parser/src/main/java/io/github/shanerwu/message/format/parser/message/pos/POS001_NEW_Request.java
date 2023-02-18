package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;

@MessageDetail("POS001_NEW_Request")
public class POS001_NEW_Request extends AbstractPOSRequest<POS001RequestBody> {

    public POS001_NEW_Request(String message) {
        super(message);
    }

}

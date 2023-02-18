package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("POS001Response")
public class POS001Response extends AbstractMessageSupport<POSResHeader,POS001ResponseBody> {

    public POS001Response(String message) {
        super(message);
    }

}

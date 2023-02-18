package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("POS002Response")
public class POS002Response extends AbstractMessageSupport<POSResHeader,POS002ResponseBody> {

    public POS002Response(String message) {
        super(message);
    }

}

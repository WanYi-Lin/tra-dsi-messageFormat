package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("POS003Response")
public class POS003Response extends AbstractMessageSupport<POSResHeader,POS003ResponseBody> {

    public POS003Response(String message) {
        super(message);
    }

}

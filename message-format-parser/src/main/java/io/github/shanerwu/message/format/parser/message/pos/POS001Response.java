package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("POS001Response")
public class POS001Response extends AbstractPOSResponse<POS001ResponseBody> {

    public POS001Response(POSResHeader header,POS001ResponseBody body) {
        super(header, body);
    }

}

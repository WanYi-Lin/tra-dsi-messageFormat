package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;


@MessageDetail("POS001_NEW_Response")
public class POS001_NEW_Response extends AbstractPOSResponse<POS001ResponseBody>{

//    public POS001_NEW_Response() {
//    }

    public POS001_NEW_Response(POSResHeader header, POS001ResponseBody body) {
        super(header, body);
    }

}

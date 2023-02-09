package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("TVM114-回覆電文")
public class TVM114Response extends AbstractMessageSupport<TVMResHeader,TVMTicketTrainInfo> {

//    public TVM114Response(TVMResponseHeader header, TVMTicketTrainInfo body) {
//        super(header, body);
//    }

    public TVM114Response(String businessData) {
        super(businessData);
    }

}

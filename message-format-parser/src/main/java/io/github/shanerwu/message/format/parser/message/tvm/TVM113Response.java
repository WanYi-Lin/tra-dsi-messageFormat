package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("TVM113-回覆電文")
public class TVM113Response extends AbstractMessageSupport<TVMResHeader,TVM113ResponseBody> {

//    public TVM113Response(TVMResponseHeader header, TVM113ResponseBody body) {
//        super(header, body);
//    }

    public TVM113Response(String businessData) {
        super(businessData);
    }

}

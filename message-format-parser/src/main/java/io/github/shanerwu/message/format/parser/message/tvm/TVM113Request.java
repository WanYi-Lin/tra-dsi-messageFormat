package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("TVM113-請求電文")
public class TVM113Request extends AbstractMessageSupport<TVMReqHeader, TVM113RequestBody> {
    //test
    public TVM113Request(String businessData) {
        super(businessData);
    }

}

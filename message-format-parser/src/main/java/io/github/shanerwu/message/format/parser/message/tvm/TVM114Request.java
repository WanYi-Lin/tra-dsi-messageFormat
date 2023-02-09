package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("TVM114-請求電文")
public class TVM114Request extends AbstractMessageSupport<TVMReqHeader,TVM114RequestBody> {

    public TVM114Request(String businessData) {
        super(businessData);
    }

}

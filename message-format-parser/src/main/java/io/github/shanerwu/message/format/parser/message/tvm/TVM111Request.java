package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("TVM111-請求電文")
public class TVM111Request extends AbstractMessageSupport<TVMReqHeader, TVM111RequestBody> {

    public TVM111Request(String message) {
        super(message);
    }
}

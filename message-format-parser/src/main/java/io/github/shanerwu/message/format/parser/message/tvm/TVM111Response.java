package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.annotation.MessageDetail;
import io.github.shanerwu.message.format.parser.message.AbstractMessageSupport;

@MessageDetail("TVM111-回覆電文")
public class TVM111Response extends AbstractMessageSupport<TVMResHeader, TVM111ResponseBody> {

    public TVM111Response(String message) {
        super(message);
    }
}

package io.github.shanerwu.message.format.parser.message.tvm;

import lombok.Getter;
import lombok.Setter;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

@Getter
@Setter
public class TVM113ResponseBodyBentoDetail extends MessageFormatSupport {

    /** 回程可訂便當代碼 */
    @MessageFormat(length = 10)
    private String bentoCode;

}

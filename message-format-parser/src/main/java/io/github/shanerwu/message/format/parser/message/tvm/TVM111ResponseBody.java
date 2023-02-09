package io.github.shanerwu.message.format.parser.message.tvm;

import java.util.List;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TVM111ResponseBody extends MessageFormatSupport {

    /** 車次清單數 */
    @MessageFormat(length = 4, description = "車次清單數")
    private int trnNoList;

    /** 車次清單 */
    @MessageFormat(length = 69, reference = "trnNoList", description = "車次清單")
    private List<TVM111ResponseDetail> details;

}

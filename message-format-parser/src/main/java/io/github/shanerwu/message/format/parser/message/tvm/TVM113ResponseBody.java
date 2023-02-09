package io.github.shanerwu.message.format.parser.message.tvm;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

@Getter
@Setter
public class TVM113ResponseBody extends MessageFormatSupport {

    /** 是否可加訂便當 */
    @MessageFormat(length = 1)
    private String bentoAvailable;

    /** 可訂便當種類清單數 */
    @MessageFormat(length = 3)
    private int bentoTypeList;

    /** bentoDetail */
    @MessageFormat(length = 10, reference = "bentoTypeList")
    private List<TVM113ResponseBodyBentoDetail> bentoDetail;

    /** 座位數 */
    @MessageFormat(length = 2)
    private int tktCount;

    /** details */
    @MessageFormat(length = 98, reference = "tktCount")
    private List<TVM113ResponseBodyDetail> details;

}

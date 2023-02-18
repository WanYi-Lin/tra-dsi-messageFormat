package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class POS003RequestBody extends MessageFormatSupport {

    /** 代售業者交易日期時間 */
    @MessageFormat(length = 14, description = "代售業者交易日期時間")
    private String ciiDate;

    /** 退票張數 */
    @MessageFormat(length = 2, description = "退票張數")
    private int cancelCount;

    /** 退票資料明細 */
    @MessageFormat(length = 22, reference = "cancelCount", description = "退票資料明細")
    private List<POS003RequestBodyDetail> details;

}

package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class POS001ResponseBody extends MessageFormatSupport {

    /** 預約筆數 */
    @MessageFormat(length = 2, description = "預約筆數")
    private int recCnt;

    /** 預約資料清單 */
    @MessageFormat(length = 59, reference = "recCnt", description = "預約資料清單")
    private List<POS001ResponseBodyDetail> details;

}

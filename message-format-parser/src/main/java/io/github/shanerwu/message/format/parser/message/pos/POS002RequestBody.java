package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class POS002RequestBody extends MessageFormatSupport {

    /** 代售業者交易日期時間 */
    @MessageFormat(length = 14, description = "代售業者交易日期時間")
    private String ciiDate;

    /** 訂票代碼 */
    @MessageFormat(length = 7, description = "訂票代碼")
    private String recNo;

    /** 身分證號/護照號碼 */
    @MessageFormat(length = 10, description = "身分證號/護照號碼")
    private String customerId;

    /** 乘客別數量 */
    @MessageFormat(length = 2, description = "乘客別數量")
    private int psgrTypeCnt;

    /** 預約資料明細 */
    @MessageFormat(length = 12, reference = "psgrTypeCnt", description = "預約資料明細")
    private List<POS002RequestBodyDetail> details;

}

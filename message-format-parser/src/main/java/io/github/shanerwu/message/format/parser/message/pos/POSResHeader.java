package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POSResHeader extends MessageFormatSupport {

    /** 交易碼 */
    @MessageFormat(length = 14, description = "交易碼")
    private String txCode;

    /** 交易流水號 */
    @MessageFormat(length = 15, description = "交易流水號")
    private String serialNo;

    /** 系統處理日期時間 */
    @MessageFormat(length = 14, description = "系統處理日期時間")
    private String systemDate;

    /** 訊息代碼 */
    @MessageFormat(length = 3, description = "訊息代碼")
    private String msgCode;

    /** 電文回覆長度 : Response的Header+body總長 */
    @MessageFormat(length = 4, description = "電文回覆長度")
    private int responseLength;

}

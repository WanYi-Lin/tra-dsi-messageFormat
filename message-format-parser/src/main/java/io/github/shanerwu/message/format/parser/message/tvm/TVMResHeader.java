package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

public class TVMResHeader extends MessageFormatSupport {

    /** 交易流水號 */
    @MessageFormat(length = 4, description = "流水號")
    private String txSerialNo;

    /** 系統處理日期時間 */
    @MessageFormat(length = 14, description = "系統處理日期時間")
    private String systemDate;

    /** 訊息代碼 */
    @MessageFormat(length = 3, description = "訊息代碼")
    private String msgCode;

    /** 電文長度 */
    @MessageFormat(length = 5, description = "電文長度")
    private int msgLength;

}

package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POSReqHeader extends MessageFormatSupport {
    /** 功能代碼 */
    @MessageFormat(length = 6, description = "功能代碼")
    private String transCode;

    /** 交易流水號 */
    @MessageFormat(length = 15, description = "交易流水號")
    private String serialNo;

    /** 模組代碼 */
    @MessageFormat(length = 2, description = "模組代碼", trimToEmpty = false)
    private String modCode;

    /** 局碼 */
    @MessageFormat(length = 1, description = "局碼")
    private String sectionNo;

    /** 站名 + 終端代碼 */
    @MessageFormat(length = 6, description = "站名 + 終端代碼")
    private String agentTerm;

    /** 電文請求長度 : Request的Header+body總長 */
    @MessageFormat(length = 4, description = "電文請求長度")
    private int requestLength;

}

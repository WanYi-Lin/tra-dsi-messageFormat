package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

public class TVMReqHeader extends MessageFormatSupport {

    /** 交易碼 */
    @MessageFormat(length = 6, description = "交易碼")
    private String transCode;

    /** 流水號 */
    @MessageFormat(length = 4, description = "流水號")
    private String serialNo;

    /** 交易別 */
    @MessageFormat(length = 2, description = "交易別")
    private String modCode;

    /** 電文長度 */
    @MessageFormat(length = 5, description = "電文長度")
    private int msgLength;

}

package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POS001RequestBody extends MessageFormatSupport {

    /** 訂票代碼 */
    @MessageFormat(length = 7, description = "訂票代碼")
    private String recNo;

    /** 身分證號/護照號碼 */
    @MessageFormat(length = 10, description = "身分證號/護照號碼")
    private String customerId;

    /** 乘車日 */
    @MessageFormat(length = 8, description = "乘車日")
    private String trnDate;

    /** 起站 */
    @MessageFormat(length = 4, description = "起站")
    private String oriSta;

    /** 到站 */
    @MessageFormat(length = 4, description = "到站")
    private String dstSta;

}

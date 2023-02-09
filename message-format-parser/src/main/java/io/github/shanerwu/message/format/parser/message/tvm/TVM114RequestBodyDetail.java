package io.github.shanerwu.message.format.parser.message.tvm;

import lombok.Getter;
import lombok.Setter;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

@Getter
@Setter
public class TVM114RequestBodyDetail extends MessageFormatSupport {

    /** 車廂號碼 */
    @MessageFormat(length = 4)
    private String carNo;

    /** 座號 */
    @MessageFormat(length = 3)
    private String seatNo;

    /** 座位態樣 */
    @MessageFormat(length = 2)
    private String seatPattern;

    /** 座位種類 */
    @MessageFormat(length = 3)
    private String seatKind;

    /** 座位驗證碼 */
    @MessageFormat(length = 36)
    private String seatVerificationCode;

    /** 票種 */
    @MessageFormat(length = 2)
    private int psgrType;

    /** 身分憑證號碼 */
    @MessageFormat(length = 10)
    private String certNo;

    /** 第一個便當代碼 */
    @MessageFormat(length = 10)
    private String firstBento;

    /** 第二個便當代碼 */
    @MessageFormat(length = 10)
    private String secondBento;

    /** 換座或無座車站 */
    @MessageFormat(length = 4)
    private String chgOrNoSeatSta;

    /** 換座車廂號碼 */
    @MessageFormat(length = 4)
    private String chgCarNo;

    /** 換座座號 */
    @MessageFormat(length = 3)
    private String chgSeatNo;

    /** 換座或無座座位驗證碼 */
    @MessageFormat(length = 36)
    private String chgOrNoSeatVerificationCode;

}

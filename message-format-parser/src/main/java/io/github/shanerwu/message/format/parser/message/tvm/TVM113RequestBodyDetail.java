package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.annotation.FormatAlign;
import lombok.Getter;
import lombok.Setter;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

@Getter
@Setter
public class TVM113RequestBodyDetail extends MessageFormatSupport {

    /** 車廂號碼 */
    @MessageFormat(length = 4)
    private String carNo;

    /** 座號 */
    @MessageFormat(length = 3)
    private String seatNo;

    /** 座位態樣 */
    @MessageFormat(length = 2)
    private String seatPattern;

    /** 座位驗證碼 */
    @MessageFormat(length = 36)
    private String seatVerificationCode;

    /** 座位票種 */
    @MessageFormat(length = 2, paddingWord = '0', align = FormatAlign.RIGHT)
    private String psgrType;

    /** 選座MARK */
    @MessageFormat(length = 1)
    private String seatConfirm;

    /** 座位種類 */
    @MessageFormat(length = 3)
    private String seatKind;

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

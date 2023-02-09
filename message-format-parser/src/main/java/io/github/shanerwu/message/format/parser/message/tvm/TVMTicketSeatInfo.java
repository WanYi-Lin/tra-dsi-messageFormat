package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.annotation.FormatAlign;
import lombok.Getter;
import lombok.Setter;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

@Getter
@Setter
public class TVMTicketSeatInfo extends MessageFormatSupport {

    /** 車廂號碼 */
    @MessageFormat(length = 4)
    private String carNo;

    /** 座號 */
    @MessageFormat(length = 3)
    private String seatNo;

    /** 座位態樣 */
    @MessageFormat(length = 2)
    private Integer seatPattern;

    /** 座位種類 */
    @MessageFormat(length = 3)
    private String seatKind;

    /** 限搭乘車廂備註 */
    @MessageFormat(length = 15)
    private String restrictCarRemark;

    /** 換座或無座車站 */
    @MessageFormat(length = 4)
    private String chgOrNoSeatSta;

    /** 換座車號 */
    @MessageFormat(length = 4)
    private String chgCarNo;

    /** 換座座號 */
    @MessageFormat(length = 3)
    private String chgSeatNo;

    /** 票種 */
    @MessageFormat(length = 2, paddingWord = '0', align = FormatAlign.RIGHT)
    private String psgrType;

    /** 身分憑證號碼 */
    @MessageFormat(length = 10)
    private String certNo;

    /** 座位票價 */
    @MessageFormat(length = 4)
    private int trnTktPrice;

    /** 第一個便當代碼 */
    @MessageFormat(length = 10)
    private String firstBento;

    /** 第二個便當代碼 */
    @MessageFormat(length = 10)
    private String secondBento;

    /** 票號 */
    @MessageFormat(length = 15)
    private String tktNo;

    /** 錄磁票號 */
    @MessageFormat(length = 20)
    private String magTktNo;

    /** 簡字字元 */
    @MessageFormat(length = 10)
    private String abbr;

    /** QRCode */
    @MessageFormat(length = 70)
    private String qrCode;

    /** 信用卡發卡行代碼(前6碼) */
    @MessageFormat(length = 6)
    private String creditCardBankNo;

    /** 信用卡卡號後4碼 */
    @MessageFormat(length = 4)
    private String creditLast4No;

    /** 便當券號 */
    @MessageFormat(length = 15)
    private String bentoNo;

    /** 自行車票價 */
    @MessageFormat(length = 4)
    private int bikePrice;

}

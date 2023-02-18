package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.FormatAlign;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POS002ResponseBodyDetail extends MessageFormatSupport {

    /** 票面特殊字樣 */
    @MessageFormat(length = 20, description = "票面特殊字樣")
    private String abbrNo;

    /** 郵輪列車接駁車次 */
    @MessageFormat(length = 4, description = "郵輪列車接駁車次")
    private String cruiseTrnNo;

    /** 車廂型態 */
    @MessageFormat(length = 1, description = "車廂型態")
    private String boxType;

    /** 車廂號碼 */
    @MessageFormat(length = 4, description = "車廂號碼")
    private String carNo;

    /** 座號 */
    @MessageFormat(length = 3, description = "座號")
    private String seatNo;

    /** 票種 */
    @MessageFormat(length = 2, align = FormatAlign.RIGHT, paddingWord = '0', description = "票種")
    private String psgrType;

    /** 票號 */
    @MessageFormat(length = 15, description = "票號")
    private String tktNo;

    /** QR Code */
    @MessageFormat(length = 60, description = "QR Code")
    private String qrCode;

    /** 票價 */
    @MessageFormat(length = 4, description = "票價")
    private int tranTktPrice;

    /** 自行車票價 */
    @MessageFormat(length = 4, description = "自行車票價")
    private int bikePrice;

    /** 座位狀態 */
    @MessageFormat(length = 2, description = "座位狀態")
    private String seatPattern;

    /** 轉乘車廂號碼 */
    @MessageFormat(length = 4, description = "轉乘車廂號碼")
    private String chgCarNo;

    /** 轉乘座位號碼 */
    @MessageFormat(length = 3, description = "轉乘座位號碼")
    private String chgSeatNo;

    /** 換座車站 */
    @MessageFormat(length = 4, description = "換座車站")
    private String chgSeatSta;

    /** 第一個便當種類 */
    @MessageFormat(length = 10, description = "第一個便當種類")
    private String benName1;

    /** 第二個便當種類 */
    @MessageFormat(length = 10, description = "第二個便當種類")
    private String benName2;

    /** 第一個便當金額 */
    @MessageFormat(length = 4, description = "第一個便當金額")
    private int benPrice1;

    /** 第二個便當金額 */
    @MessageFormat(length = 4, description = "第二個便當金額")
    private int benPrice2;

    /** 便當總金額 */
    @MessageFormat(length = 5, description = "便當總金額")
    private int bentoAmt;

}

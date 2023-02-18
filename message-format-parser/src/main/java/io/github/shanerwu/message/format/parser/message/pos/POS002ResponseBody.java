package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class POS002ResponseBody extends MessageFormatSupport {

    /** 訂單編號 */
    @MessageFormat(length = 36, description = "訂單編號")
    private String orderNo;

    /** 狀態碼 */
    @MessageFormat(length = 2, description = "狀態碼")
    private String status;

    /** 乘車日 */
    @MessageFormat(length = 8, description = "乘車日")
    private String trnDate;

    /** 車次 */
    @MessageFormat(length = 5, description = "車次")
    private String trnNo;

    /** 車種 */
    @MessageFormat(length = 1, description = "車種")
    private String trnClass;

    /** 起站 */
    @MessageFormat(length = 4, description = "起站")
    private String oriSta;

    /** 到站 */
    @MessageFormat(length = 4, description = "到站")
    private String dstSta;

    /** 前段異級車種 */
    @MessageFormat(length = 1, description = "前段異級車種")
    private String befChgTrnClass;

    /** 前段異級車站 */
    @MessageFormat(length = 4, description = "前段異級車站")
    private String befChgSta;

    /** 後段異級車種 */
    @MessageFormat(length = 1, description = "後段異級車種")
    private String aftChgTrnClass;

    /** 後段異級車站 */
    @MessageFormat(length = 4, description = "後段異級車站")
    private String aftChgSta;

    /** 開車時刻 */
    @MessageFormat(length = 4, description = "開車時刻")
    private String trnOriStaDepTime;

    /** 到達時刻 */
    @MessageFormat(length = 4, description = "到達時刻")
    private String trnDstStaArrTime;

    /** 總金額(票價+便當總金額+自行車票價) */
    @MessageFormat(length = 5, description = "總金額")
    private int payAmt;

    /** 方向 */
    @MessageFormat(length = 1, description = "方向")
    private String direction;

    /** 列車樣式 */
    @MessageFormat(length = 1, description = "列車樣式")
    private String carKind;

    /** 信用卡卡號 */
    @MessageFormat(length = 10, description = "信用卡卡號")
    private String creditCard;

    /** 郵輪式列車回程車次 */
    @MessageFormat(length = 5, description = "郵輪式列車回程車次")
    private String cruiseRetTrnNo;

    /** 郵輪式列車回程起站 */
    @MessageFormat(length = 4, description = "郵輪式列車回程起站")
    private String cruiseRetOriSta;

    /** 郵輪式列車回程到站 */
    @MessageFormat(length = 4, description = "郵輪式列車回程到站")
    private String cruiseRetDstSta;

    /** 郵輪式列車回程起站時間 */
    @MessageFormat(length = 4, description = "郵輪式列車回程起站時間")
    private String cruiseTrnOriTime;

    /** 座位數 */
    @MessageFormat(length = 2, description = "座位數")
    private int tktCount;

    /** 票面資訊清單 */
    @MessageFormat(length = 163, reference = "tktCount", description = "票面資訊清單")
    private List<POS002ResponseBodyDetail> details;

}

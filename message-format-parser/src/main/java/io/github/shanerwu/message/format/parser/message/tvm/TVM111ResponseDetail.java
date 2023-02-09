package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.FormatAlign;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TVM111ResponseDetail extends MessageFormatSupport {

    /** 主段發車站 */
    @MessageFormat(length = 4, description = "主段發車站")
    private String startSta;

    /** 主段終點站 */
    @MessageFormat(length = 4, description = "主段終點站")
    private String endSta;

    /** 主段經由路線 1:山 2:海 */
    @MessageFormat(length = 1, description = "主段經由路線 1:山 2:海")
    private int trnThrough;

    /** 主段方向 1:順 2:逆 */
    @MessageFormat(length = 1, description = "主段方向 1:順 2:逆")
    private int trnDirection;

    /** 行駛日期 */
    @MessageFormat(length = 8, description = "行駛日期")
    private String trnDate;

    /** 主段開車時刻(起站) */
    @MessageFormat(length = 4, description = "主段開車時刻(起站)")
    private String oriStaDepTime;

    /** 主段到達時刻(迄站) */
    @MessageFormat(length = 4, description = "主段到達時刻(迄站)")
    private String dstStaArrTime;

    /** 主段車次 */
    @MessageFormat(length = 5, description = "主段車次")
    private String trnNo;

    /** 主段車種 */
    @MessageFormat(length = 3, paddingWord = '0', align = FormatAlign.RIGHT, description = "主段車種")
    private String trnClass;

    /** 主段起站 */
    @MessageFormat(length = 4, description = "主段起站")
    private String oriSta;

    /** 主段迄站 */
    @MessageFormat(length = 4, description = "主段迄站")
    private String dstSta;

    /** 前段異級車種 */
    @MessageFormat(length = 3, paddingWord = '0', align = FormatAlign.RIGHT, description = "前段異級車種")
    private String befChgTrnClass;

    /** 前段異級車站 */
    @MessageFormat(length = 4, description = "前段異級車站")
    private String befChgSta;

    /** 後段異級車種 */
    @MessageFormat(length = 3, paddingWord = '0', align = FormatAlign.RIGHT, description = "後段異級車種")
    private String aftChgTrnClass;

    /** 後段異級車站 */
    @MessageFormat(length = 4, description = "後段異級車站")
    private String aftChgSta;

    /** 列車誤點資訊 */
    @MessageFormat(length = 3, description = "列車誤點資訊")
    private int delayMark;

    /** 主段行駛距離 */
    @MessageFormat(length = 5, description = "主段行駛距離")
    private String runningDistance;

    /** 是否為對號列車 */
    @MessageFormat(length = 1, description = "是否為對號列車")
    private String isReserved;

    /** 是否有輪椅座 */
    @MessageFormat(length = 1, description = "是否有輪椅座")
    private String isWheelChair;

    /** 是否有親子座 */
    @MessageFormat(length = 1, description = "是否有親子座")
    private String isParentChildSeat;

    /** 是否有桌型座 */
    @MessageFormat(length = 1, description = "是否有桌型座")
    private String isTableSeat;

    /** 是否有商務座 */
    @MessageFormat(length = 1, description = "是否有商務座")
    private String isBusinessSeat;

}

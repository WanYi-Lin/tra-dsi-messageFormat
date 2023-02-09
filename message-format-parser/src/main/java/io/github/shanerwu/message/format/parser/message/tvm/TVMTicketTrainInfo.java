package io.github.shanerwu.message.format.parser.message.tvm;

import java.util.List;

import io.github.shanerwu.message.format.core.annotation.FormatAlign;
import lombok.Getter;
import lombok.Setter;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

@Getter
@Setter
public class TVMTicketTrainInfo extends MessageFormatSupport {

    /** 晚點註記分鐘 */
    @MessageFormat(length = 3)
    private int delayMark;

    /** 車票訂單號碼 */
    @MessageFormat(length = 37)
    private String orderNo;

    /** 交易流水號 */
    @MessageFormat(length = 36)
    private String serialNo;

    /** 乘車日期 */
    @MessageFormat(length = 8)
    private String boardingDate;

    /** 開車時刻 */
    @MessageFormat(length = 4)
    private String trnOriStaDepTime;

    /** 到達時刻 */
    @MessageFormat(length = 4)
    private String trnDstStaArrTime;

    /** 車次 */
    @MessageFormat(length = 5)
    private String trnNo;

    /** 車種 */
    @MessageFormat(length = 3, paddingWord = '0', align = FormatAlign.RIGHT)
    private String trnClass;

    /** 主段起站 */
    @MessageFormat(length = 4)
    private String oriSta;

    /** 主段到站 */
    @MessageFormat(length = 4)
    private String dstSta;

    /** 前段異級車種 */
    @MessageFormat(length = 3, paddingWord = '0', align = FormatAlign.RIGHT)
    private String befChgTrnClass;

    /** 前段異級車站 */
    @MessageFormat(length = 4)
    private String befChgSta;

    /** 後段異級車種 */
    @MessageFormat(length = 3, paddingWord = '0', align = FormatAlign.RIGHT)
    private String aftChgTrnClass;

    /** 後段異級車站 */
    @MessageFormat(length = 4)
    private String aftChgSta;

    /** 便當統一編號 */
    @MessageFormat(length = 8)
    private String bentoUniformNo;

    /** 座位數 */
    @MessageFormat(length = 2)
    private int tktCount;

    /** details */
    @MessageFormat(length = 218, reference = "tktCount")
    private List<TVMTicketSeatInfo> details;

}

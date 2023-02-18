package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.FormatAlign;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class POS001ResponseBodyDetail extends MessageFormatSupport {

    /** 訂票代碼 */
    @MessageFormat(length = 7, description = "訂票代碼")
    private String recNo;

    /** 乘車日 */
    @MessageFormat(length = 8, description = "乘車日")
    private String trnDate;

    /** 車次 */
    @MessageFormat(length = 5, description = "車次")
    private String trnNo;

    /** 車種 */
    @MessageFormat(length = 1, description = "車種")
    private String trnClass;

    /** 車廂型態 */
    @MessageFormat(length = 1, description = "車廂型態")
    private String boxType;

    /** 起站 */
    @MessageFormat(length = 4, description = "起站")
    private String oriSta;

    /** 到站 */
    @MessageFormat(length = 4, description = "到站")
    private String dstSta;

    /** 預約張數 */
    @MessageFormat(length = 2, description = "預約張數")
    private int orderCnt;

    /** 已取張數 */
    @MessageFormat(length = 2, description = "已取張數")
    private int recCnt;

    /** 未取張數 */
    @MessageFormat(length = 2, description = "未取張數")
    private int unRecCnt;

    /** 票種資料 */
    @MessageFormat(length = 12, reference = "unRecCnt", description = "票種資料")
    private List<POS001ResponsePsgrType> psgrTypes;

    /** 預約日期 */
    @MessageFormat(length = 8, description = "預約日期")
    private String recDate;

    /** 預約資料狀態 */
    @MessageFormat(length = 2, align = FormatAlign.RIGHT, paddingWord = '0', description = "預約資料狀態")
    private String recStatus;

    /** 是否有便當 */
    @MessageFormat(length = 1, description = "是否有便當")
    private String hasBento;

}

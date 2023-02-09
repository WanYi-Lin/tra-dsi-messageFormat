package io.github.shanerwu.message.format.parser.message.tvm;

import java.util.List;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TVM111RequestBody extends MessageFormatSupport {

    /** 終端機代號 */
    @MessageFormat(length = 8, description = "終端機代號")
    private String termId;

    /** 起站 */
    @MessageFormat(length = 4, description = "起站")
    private String oriSta;

    /** 迄站 */
    @MessageFormat(length = 4, description = "迄站")
    private String dstSta;

    /** 乘車日期 */
    @MessageFormat(length = 8, description = "乘車日期")
    private String trnDate;

    /** 查詢邏輯 Q:快速 S:智慧 (異級票) */
    @MessageFormat(length = 1, description = "查詢邏輯 Q:快速 S:智慧 (異級票)")
    private String queryStrategy;

    /** 是否需要輪椅座 */
    @MessageFormat(length = 1, description = "是否需要輪椅座")
    private String isPrefWheelChair;

    /** 是否需要親子座 */
    @MessageFormat(length = 1, description = "是否需要親子座")
    private String isPrefParentChildSeat;

    /** 是否需要桌型座 */
    @MessageFormat(length = 1, description = "是否需要桌型座")
    private String isPrefTableSeat;

    /** 是否需要商務座 */
    @MessageFormat(length = 1, description = "是否需要商務座")
    private String isPrefBusinessSeat;

    /** 主段車種偏好清單數 */
    @MessageFormat(length = 2, description = "主段車種偏好清單數")
    private int prefTrnClasses;

    /** 車種偏好清單 */
    @MessageFormat(length = 3, reference = "prefTrnClasses", description = "車種偏好清單")
    private List<TVM111RequestBodyDetail> details;

}

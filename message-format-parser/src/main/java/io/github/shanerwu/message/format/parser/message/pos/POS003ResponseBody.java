package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class POS003ResponseBody extends MessageFormatSupport {

    /** 訂單編號 */
    @MessageFormat(length = 36, description = "訂單編號")
    private String orderNo;

    /** 狀態碼 */
    @MessageFormat(length = 2, description = "狀態碼")
    private String status;

    /** 退票張數 */
    @MessageFormat(length = 2, description = "退票張數")
    private int cancelCount;

    /** 退票總手續費 */
    @MessageFormat(length = 4, description = "退票總手續費")
    private int totalCancelFee;

    /** 退票總票價 */
    @MessageFormat(length = 6, description = "退票總票價")
    private int totalTrnTktPrice;

    /** 退票總便當價 */
    @MessageFormat(length = 6, description = "退票總便當價")
    private int totalBenPrice;

    /** 退票總金額(總票價+總便當價-手續費) */
    @MessageFormat(length = 6, description = "退票總金額")
    private int total;

    /** 付款方式 */
    @MessageFormat(length = 4, description = "付款方式")
    private String payWay;

    /** 退票資料明細 */
    @MessageFormat(length = 30, reference = "cancelCount", description = "退票資料明細")
    private List<POS003ResponseDetail> details;

}

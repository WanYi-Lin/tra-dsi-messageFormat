package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POS003ResponseDetail extends MessageFormatSupport {

    /** 票號 */
    @MessageFormat(length = 15, description = "票號")
    private String tktNo;

    /** 票價 */
    @MessageFormat(length = 4, description = "票價")
    private int tranTktPrice;

    /** 手續費 */
    @MessageFormat(length = 3, description = "手續費")
    private int cancelFee;

    /** 退回已使用會員點數 */
    @MessageFormat(length = 4, description = "退回已使用會員點數")
    private int discPoints;

    /** 退回已使用會員點數換算金額 */
    @MessageFormat(length = 4, description = "退回已使用會員點數換算金額")
    private int pointTktPrice;

}

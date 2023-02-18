package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POSTktRequestBody extends MessageFormatSupport {

    /** 代售業者交易日期時間 */
    @MessageFormat(length = 14, description = "代售業者交易日期時間")
    private String ciiDate;

    /** 訂單編號 */
    @MessageFormat(length = 36, description = "訂單編號")
    private String orderNo;

}

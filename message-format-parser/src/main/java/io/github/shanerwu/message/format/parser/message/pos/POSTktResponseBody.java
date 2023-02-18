package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POSTktResponseBody extends MessageFormatSupport {

    /** 訂單編號 */
    @MessageFormat(length = 36, description = "訂單編號")
    private String orderNo;

    /** 狀態碼 */
    @MessageFormat(length = 2, description = "狀態碼")
    private String status;

}

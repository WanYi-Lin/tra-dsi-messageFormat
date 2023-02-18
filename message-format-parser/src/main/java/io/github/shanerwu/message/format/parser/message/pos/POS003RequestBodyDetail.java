package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POS003RequestBodyDetail extends MessageFormatSupport {

    /** 票號 */
    @MessageFormat(length = 15, description = "票號")
    private String tktNo;

    /** 車廂號碼 */
    @MessageFormat(length = 4, description = "車廂號碼")
    private String carNo;

    /** 座號 */
    @MessageFormat(length = 3, description = "座號")
    private String seatNo;

}

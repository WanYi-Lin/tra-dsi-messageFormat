package io.github.shanerwu.message.format.parser.message.pos;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.FormatAlign;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POS001ResponsePsgrType extends MessageFormatSupport {

    /** 票種 */
    @MessageFormat(length = 2, align = FormatAlign.RIGHT, paddingWord = '0',  description = "票種")
    private String psgrType;

    /** 身分憑證號碼 */
    @MessageFormat(length = 10, description = "身分憑證號碼")
    private String certNo;

}

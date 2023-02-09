package io.github.shanerwu.message.format.parser.message.tvm;

import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

public class TVM111RequestBodyDetail extends MessageFormatSupport {

    /** 車種偏好 */
    @MessageFormat(length = 3, description = "車種偏好")
    private String prefTrnClass;

}

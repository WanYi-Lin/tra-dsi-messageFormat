package io.github.shanerwu.message.format.parser.message.tvm;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import io.github.shanerwu.message.format.core.MessageFormatSupport;
import io.github.shanerwu.message.format.core.annotation.MessageFormat;

@Getter
@Setter
public class TVM113RequestBody extends MessageFormatSupport {

    /** 終端機代號 */
    @MessageFormat(length = 8)
    private String termId;

    /** 主段起站 */
    @MessageFormat(length = 4)
    private String oriSta;

    /** 主段到站 */
    @MessageFormat(length = 4)
    private String dstSta;

    /** 乘車日 */
    @MessageFormat(length = 8)
    private String trnDate;

    /** 車次 */
    @MessageFormat(length = 5)
    private String trnNo;

    /** 前段異級車種 */
    @MessageFormat(length = 3)
    private String befChgTrnClass;

    /** 前段異級車站 */
    @MessageFormat(length = 4)
    private String befChgSta;

    /** 後段異級車種 */
    @MessageFormat(length = 3)
    private String aftChgTrnClass;

    /** 後段異級車站 */
    @MessageFormat(length = 4)
    private String aftChgSta;

    /** 可選座位數 */
    @MessageFormat(length = 2)
    private int tktCount;

    /** 可選座位清單 */
    @MessageFormat(length = 98, reference = "tktCount")
    private List<TVM113RequestBodyDetail> details;

}

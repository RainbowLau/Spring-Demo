package cn.emailexception..model.auto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2020-10-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class News extends Model {

    private static final long serialVersionUID = 1L;

    @TableId("NID")
    private Integer nid;

    @TableField("NTID")
    private Integer ntid;

    @TableField("NTITLE")
    private String ntitle;

    @TableField("NAUTHOR")
    private String nauthor;

    @TableField("NCREATEDATE")
    private LocalDateTime ncreatedate;

    @TableField("NPICPATH")
    private String npicpath;

    @TableField("NCONTENT")
    private String ncontent;

    @TableField("NMODIFYDATE")
    private LocalDateTime nmodifydate;

    @TableField("NSUMMARY")
    private String nsummary;


}

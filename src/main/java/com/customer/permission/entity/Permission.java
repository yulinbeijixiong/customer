package com.customer.permission.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-01-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 别名
     */
    private String alias;

    /**
     * 创建日期
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 名称
     */
    private String name;

    /**
     * 上级权限
     */
    private Integer pid;


}

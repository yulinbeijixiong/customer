package com.customer.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("jhi_user")
public class JhiUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableField("id")
    private Long id;

    @TableField("PASSWORD")
    private String password;

    @TableField("first_name")
    private String firstName;

    @TableField("last_name")
    private String lastName;

    private String email;

    private Boolean activated;

    @TableField("lang_key")
    private String langKey;

    @TableField("activation_key")
    private String activationKey;

    @TableField("reset_key")
    private String resetKey;

    @TableField("created_by")
    private String createdBy;

    @TableField("created_date")
    private LocalDateTime createdDate;

    @TableField("reset_date")
    private LocalDateTime resetDate;

    @TableField("last_modified_by")
    private String lastModifiedBy;

    @TableField("last_modified_date")
    private LocalDateTime lastModifiedDate;

    @TableField("department_id")
    private Long departmentId;

    private String gender;

    @TableField("is_leader")
    private Boolean isLeader;

    /**
     * 家庭住址
     */
    private String location;

    /**
     * 用户手机
     */
    @TableField("mobile_phone")
    private String mobilePhone;

    @TableField("position_id")
    private Long positionId;

    private String telephone;

    private String flag;

    @TableField("created_time")
    private Long createdTime;

    @TableField("last_modified_time")
    private Long lastModifiedTime;

    @TableField("head_image")
    private String headImage;

    @TableField("qr_code_url")
    private String qrCodeUrl;

    /**
     * 机构id
     */
    @TableField("organization_id")
    private Long organizationId;

    /**
     * 生日
     */
    private Long birth;

    /**
     * 学历
     */
    private String education;

    /**
     * 特长
     */
    private String speciality;

    /**
     * 紧急联系人
     */
    @TableField("emergency_contact")
    private String emergencyContact;

    /**
     * 紧急联系人
     */
    @TableField("emergency_phone")
    private String emergencyPhone;

    private Double latitude;

    private Double longitude;

    /**
     * 照片
     */
    private String images;

    /**
     * gps对应的地址值
     */
    @TableField("gps_info")
    private String gpsInfo;

    /**
     * 0未修改，1已修改
     */
    @TableField("password_changed")
    private Integer passwordChanged;


}

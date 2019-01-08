package com.baomidou.ant.goods.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * @author jobob
 * @since 2019-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sdb_b2c_goods")
public class SdbB2cGoods extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "goods_id", type = IdType.AUTO)
    private Long goodsId;

    private String bn;

    private String name;

    private BigDecimal price;

    @TableField("price_min")
    private BigDecimal priceMin;

    @TableField("b1price_min")
    private BigDecimal b1priceMin;

    @TableField("wholesale_price")
    private String wholesalePrice;

    @TableField("largeorder_num")
    private Integer largeorderNum;

    @TableField("type_id")
    private Integer typeId;

    @TableField("cat_id")
    private Integer catId;

    @TableField("brand_id")
    private Integer brandId;

    private String marketable;

    private Boolean marketableflag;

    private BigDecimal store;

    @TableField("store_freeze")
    private BigDecimal storeFreeze;

    @TableField("notify_num")
    private Integer notifyNum;

    private Integer uptime;

    private Integer downtime;

    @TableField("last_modify")
    private Integer lastModify;

    private Integer createtime;

    @TableField("p_order")
    private Integer pOrder;

    @TableField("d_order")
    private Integer dOrder;

    private Float score;

    private BigDecimal cost;

    private BigDecimal mktprice;

    private BigDecimal weight;

    private String unit;

    @TableField("g_unit")
    private Integer gUnit;

    @TableField("g_r_days")
    private Integer gRDays;

    @TableField("g_width_x")
    private BigDecimal gWidthX;

    @TableField("g_width_y")
    private BigDecimal gWidthY;

    @TableField("g_width_z")
    private BigDecimal gWidthZ;

    private String brief;

    @TableField("goods_type")
    private String goodsType;

    @TableField("image_default_id")
    private String imageDefaultId;

    private String udfimg;

    @TableField("thumbnail_pic")
    private String thumbnailPic;

    @TableField("small_pic")
    private String smallPic;

    @TableField("big_pic")
    private String bigPic;

    private String intro;

    @TableField("store_place")
    private String storePlace;

    @TableField("min_buy")
    private Integer minBuy;

    @TableField("package_scale")
    private BigDecimal packageScale;

    @TableField("package_unit")
    private String packageUnit;

    @TableField("package_use")
    private String packageUse;

    @TableField("score_setting")
    private String scoreSetting;

    @TableField("nostore_sell")
    private String nostoreSell;

    @TableField("goods_setting")
    private String goodsSetting;

    @TableField("spec_desc")
    private String specDesc;

    private String params;

    private String disabled;

    @TableField("rank_count")
    private Integer rankCount;

    @TableField("comments_count")
    private Integer commentsCount;

    @TableField("view_w_count")
    private Integer viewWCount;

    @TableField("view_count")
    private Integer viewCount;

    @TableField("count_stat")
    private String countStat;

    @TableField("buy_count")
    private Integer buyCount;

    @TableField("buy_w_count")
    private Integer buyWCount;

    @TableField("p_1")
    private Integer p1;

    @TableField("p_2")
    private Integer p2;

    @TableField("p_3")
    private Integer p3;

    @TableField("p_4")
    private Integer p4;

    @TableField("p_5")
    private Integer p5;

    @TableField("p_6")
    private Integer p6;

    @TableField("p_7")
    private Integer p7;

    @TableField("p_8")
    private Integer p8;

    @TableField("p_9")
    private Integer p9;

    @TableField("p_10")
    private Integer p10;

    @TableField("p_11")
    private Integer p11;

    @TableField("p_12")
    private Integer p12;

    @TableField("p_13")
    private Integer p13;

    @TableField("p_14")
    private Integer p14;

    @TableField("p_15")
    private Integer p15;

    @TableField("p_16")
    private Integer p16;

    @TableField("p_17")
    private Integer p17;

    @TableField("p_18")
    private Integer p18;

    @TableField("p_19")
    private Integer p19;

    @TableField("p_20")
    private Integer p20;

    @TableField("p_21")
    private String p21;

    @TableField("p_22")
    private String p22;

    @TableField("p_23")
    private String p23;

    @TableField("p_24")
    private String p24;

    @TableField("p_25")
    private String p25;

    @TableField("p_26")
    private String p26;

    @TableField("p_27")
    private String p27;

    @TableField("p_28")
    private String p28;

    @TableField("p_29")
    private String p29;

    @TableField("p_30")
    private String p30;

    @TableField("p_31")
    private String p31;

    @TableField("p_32")
    private String p32;

    @TableField("p_33")
    private String p33;

    @TableField("p_34")
    private String p34;

    @TableField("p_35")
    private String p35;

    @TableField("p_36")
    private String p36;

    @TableField("p_37")
    private String p37;

    @TableField("p_38")
    private String p38;

    @TableField("p_39")
    private String p39;

    @TableField("p_40")
    private String p40;

    @TableField("p_41")
    private String p41;

    @TableField("p_42")
    private String p42;

    @TableField("p_43")
    private String p43;

    @TableField("p_44")
    private String p44;

    @TableField("p_45")
    private String p45;

    @TableField("p_46")
    private String p46;

    @TableField("p_47")
    private String p47;

    @TableField("p_48")
    private String p48;

    @TableField("p_49")
    private String p49;

    @TableField("p_50")
    private String p50;

    @TableField("store_id")
    private Long storeId;

    @TableField("goods_state")
    private String goodsState;

    @TableField("buy_m_count")
    private Integer buyMCount;

    @TableField("view_m_count")
    private Integer viewMCount;

    @TableField("fav_count")
    private Integer favCount;

    @TableField("freight_bear")
    private String freightBear;

    @TableField("marketable_allow")
    private String marketableAllow;

    @TableField("marketable_content")
    private String marketableContent;

    @TableField("act_type")
    private String actType;

    @TableField("goods_kind")
    private String goodsKind;

    @TableField("goods_order_down")
    private Integer goodsOrderDown;

    private String location;

    @TableField("expect_arrival_time")
    private String expectArrivalTime;

    @TableField("avg_point")
    private BigDecimal avgPoint;

    @TableField("custom_notice")
    private String customNotice;

    /**
     * 原始尺寸
     */
    @TableField("original_package_size")
    private String originalPackageSize;

    /**
     * 操作员
     */
    private String operator;

    @TableField("after_sales_policy")
    private String afterSalesPolicy;

    @TableField("last_modified_date")
    private LocalDateTime lastModifiedDate;

    @TableField("last_modified_time")
    private Long lastModifiedTime;

    @TableField("last_modified_by")
    private String lastModifiedBy;

    @TableField("created_by")
    private String createdBy;

    @TableField("created_date")
    private LocalDateTime createdDate;

    @TableField("created_time")
    private Long createdTime;


}

package org.shark.product.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Acer
 */
@Data
@TableName("brand")
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value="brand_id",type = IdType.AUTO)
    private Long brandId;

    /** 品牌logo */
    @TableField("brand_logo")
    private String brandLogo;

    /** 品牌封面 */
    @TableField("brand_cover")
    private String brandCover;

    /** 商品品牌名称 */
    @TableField("brand_title")
    private String brandTitle;

    /** 商品品牌描述 */
    @TableField("brand_desc")
    private String brandDesc;

    /** 品牌图文信息 */
    @TableField("brand_detail")
    private String brandDetail;

    /** 商品分类排序 */
    private Integer sort;

    /** 商品状态 */
    private Integer status;

    /** 首字母搜索 */
    @TableField("first_letter")
    private String firstLetter;

    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @TableField("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
}

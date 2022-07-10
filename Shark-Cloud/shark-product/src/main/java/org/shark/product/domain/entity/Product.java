package org.shark.product.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * spu信息
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * product id
     */
    @TableId(value = "product_id", type = IdType.AUTO)
    private Long productId;

    /**
     * 品牌ID
     */
    @TableField("brand_id")
    private Long brandId;

    /**
     * 分类ID
     */
    @TableField("category_id")
    private Long categoryId;

    /**
     * 店铺分类ID
     */
    @TableField("shop_category_id")
    private Long shopCategoryId;

    /**
     * 店铺id
     */
    @TableField("shop_id")
    private Long shopId;

    /**
     * 商品名称
     */
    @TableField("name")
    private String name;

    /**
     * 卖点
     */
    @TableField("selling_point")
    private String sellingPoint;

    /**
     * 商品介绍主图
     */
    @TableField("main_img_url")
    private String mainImgUrl;

    /**
     * 商品图片 多个图片逗号分隔
     */
    @TableField("img_urls")
    private String imgUrls;

    /**
     * 商品视频
     */
    @TableField("video")
    private String video;

    /**
     * 售价，整数方式保存
     */
    @TableField("price_fee")
    private Long priceFee;

    /**
     * 市场价，整数方式保存
     */
    @TableField("market_price_fee")
    private Long marketPriceFee;

    /**
     * 状态 -1:删除, 0:下架, 1:上架
     */
    @TableField("status")
    private Integer status;

    /**
     * sku是否含有图片 0无 1有
     */
    @TableField("has_sku_img")
    private Integer hasSkuImg;

    /**
     * 序号
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


}

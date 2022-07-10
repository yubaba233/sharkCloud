package org.shark.product.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 购物车
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cart_item")
public class CartItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "cart_item_id", type = IdType.AUTO)
    private Long cartItemId;

    /**
     * 店铺ID
     */
    @TableField("shop_id")
    private Long shopId;

    /**
     * 产品ID
     */
    @TableField("spu_id")
    private Long spuId;

    /**
     * SkuID
     */
    @TableField("sku_id")
    private Long skuId;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 购物车产品个数
     */
    @TableField("count")
    private Integer count;

    /**
     * 售价，加入购物车时的商品价格
     */
    @TableField("price_fee")
    private Long priceFee;

    /**
     * 是否已勾选
     */
    @TableField("is_checked")
    private Integer isChecked;

    /**
     * 创建时间
     */
    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;


}

package org.shark.product.domain.entity;

import java.math.BigDecimal;
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
 * sku信息
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("spec")
public class Spec implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    @TableId(value = "spec_id", type = IdType.AUTO)
    private Long specId;

    /**
     * SPU id
     */
    @TableField("product_id")
    private Long productId;

    /**
     * sku名称
     */
    @TableField("spec_name")
    private String specName;

    /**
     * 多个销售属性值id逗号分隔
     */
    @TableField("attrs")
    private String attrs;

    /**
     * sku图片
     */
    @TableField("img_url")
    private String imgUrl;

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
     * 商品编码
     */
    @TableField("party_code")
    private String partyCode;

    /**
     * 商品条形码
     */
    @TableField("model_id")
    private String modelId;

    /**
     * 商品重量
     */
    @TableField("weight")
    private BigDecimal weight;

    /**
     * 商品体积
     */
    @TableField("volume")
    private BigDecimal volume;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    @TableField("status")
    private Integer status;

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

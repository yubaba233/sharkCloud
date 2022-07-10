package org.shark.product.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 库存信息
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("spec_stock")
public class SpecStock implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 库存id
     */
    @TableId(value = "stock_id", type = IdType.AUTO)
    private Long stockId;

    /**
     * SKU ID
     */
    @TableField("spec_id")
    private Long specId;

    /**
     * 实际库存
     */
    @TableField("actual_stock")
    private Integer actualStock;

    /**
     * 锁定库存
     */
    @TableField("lock_stock")
    private Integer lockStock;

    /**
     * 可售卖库存
     */
    @TableField("stock")
    private Integer stock;

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

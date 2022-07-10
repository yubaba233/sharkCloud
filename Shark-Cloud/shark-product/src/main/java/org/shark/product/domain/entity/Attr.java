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
 * 属性信息
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("attr")
public class Attr implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * attr id
     */
    @TableId(value = "attr_id", type = IdType.AUTO)
    private Long attrId;

    /**
     * 店铺Id
     */
    @TableField("shop_id")
    private Long shopId;

    /**
     * 属性名称
     */
    @TableField("name")
    private String name;

    /**
     * 属性描述
     */
    @TableField("desc")
    private String desc;

    /**
     * 0:不需要，1:需要
     */
    @TableField("search_type")
    private Integer searchType;

    /**
     * 0:销售属性，1:基本属性
     */
    @TableField("attr_type")
    private Integer attrType;

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

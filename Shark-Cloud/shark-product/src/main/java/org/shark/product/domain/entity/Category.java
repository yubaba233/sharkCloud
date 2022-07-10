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
 * <p>
 * 
 * </p>
 *
 * @author yubaba
 * @since 2022-07-06
 */
@Data
@TableName("category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "category_id", type = IdType.AUTO)
    private Long categoryId;

    /**
     * 分类编码
     */
    @TableField("brand_id")
    private Long brandId;

    /**
     * 分类名称
     */
    @TableField("category_name")
    private String categoryName;

    /**
     * 父id
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 层级
     */
    @TableField("level")
    private Integer level;

    /**
     * 是否是叶子节点
     */
    @TableField("is_leaf")
    private Integer isLeaf;

    /**
     * 状态（0：停用。1：启用）
     */
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * logo
     */
    @TableField("category_logo")
    private String categoryLogo;

    /**
     * 排序
     */
    private Integer sort;


}

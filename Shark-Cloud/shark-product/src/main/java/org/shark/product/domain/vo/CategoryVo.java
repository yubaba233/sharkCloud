package org.shark.product.domain.vo;

import lombok.Data;

import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author yubaba
 * @since 2022-07-06
 */
@Data
public class CategoryVo {

    private Long categoryId;

    private Long brandId;

    private String categoryName;

    private Long parentId;

    private Integer level;

    private Integer status;

    private String categoryLogo;

    private Integer sort;

    private List<CategoryVo> children;

}

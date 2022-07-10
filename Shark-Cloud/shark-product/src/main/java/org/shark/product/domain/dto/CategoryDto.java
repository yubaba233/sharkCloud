package org.shark.product.domain.dto;

import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author yubaba
 * @since 2022-07-06
 */
@Data
public class CategoryDto{

    private Long categoryId;

    private Long brandId;

    private String categoryName;

    private Long parentId;

    private Integer level;

    private Integer status;

    private String categoryLogo;

    private Integer sort;

}

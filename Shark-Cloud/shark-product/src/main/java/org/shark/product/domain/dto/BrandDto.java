package org.shark.product.domain.dto;

import lombok.Data;

/**
 * @author Acer
 */
@Data
public class BrandDto{

    private Long brandId;

    private String brandLogo;

    private String brandCover;

    private String brandTitle;

    private String brandDesc;

    private String brandDetail;

    private String firstLetter;

    private Integer sort;

    private Integer status;

}

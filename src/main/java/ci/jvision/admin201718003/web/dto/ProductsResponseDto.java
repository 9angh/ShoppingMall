package ci.jvision.admin201718003.web.dto;

import ci.jvision.admin201718003.domain.products.Products;
import lombok.Getter;

@Getter
public class ProductsResponseDto {
    private Long p_id;
    private String p_name;
    private Long p_price;
    private String p_desc;

    public ProductsResponseDto(Products entity)
    {
        this.p_id = entity.getP_id();
        this.p_name = entity.getP_name();
        this.p_price = entity.getP_price();
        this.p_desc = entity.getP_desc();
    }

}

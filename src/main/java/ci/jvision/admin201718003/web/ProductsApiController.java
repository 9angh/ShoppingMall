package ci.jvision.admin201718003.web;

import ci.jvision.admin201718003.service.ProductsService;
import ci.jvision.admin201718003.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {

    private final ProductsService ProductsService;

    @PostMapping("/api/v1/Products")
    public Long save(@RequestBody ProductsSaveRequestDto requestDto)
    {
        return ProductsService.save(requestDto);
    }

}

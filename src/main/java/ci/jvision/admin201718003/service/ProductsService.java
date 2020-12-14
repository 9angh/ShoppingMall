package ci.jvision.admin201718003.service;

import ci.jvision.admin201718003.domain.products.ProductsRepository;
import ci.jvision.admin201718003.web.dto.ProductsListResponseDto;
import ci.jvision.admin201718003.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductsService {

    private final ProductsRepository ProductsRepository;

    @Transactional
    public Long save(ProductsSaveRequestDto requestDto)
    {
        return ProductsRepository.save(requestDto.toEntity()).getP_id();
    }


    @Transactional
    public List<ProductsListResponseDto> findAllDesc()
    {
        return ProductsRepository.findAllDesc().stream()
                .map(ProductsListResponseDto::new)
                .collect(Collectors.toList());
    }
}

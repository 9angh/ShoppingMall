package ci.jvision.admin201718003.web;

import ci.jvision.admin201718003.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final ProductsService ProductsService;

    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("Products", ProductsService.findAllDesc());
        return "index";
    }

    @GetMapping("/Products/save")
    public String ProductsSave()
    {
        return "Products-save";
    }

}

package sd_19.watch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sd_19.watch.model.san_pham.DongHo;
import sd_19.watch.services.san_pham.DongHoService;

import java.util.List;

@Controller
@RequestMapping("/trang-chu")
public class HomeController {
    @Autowired
    private DongHoService dongHoService;
    @GetMapping("")
    public String homePage(Model model,
                           @RequestParam(defaultValue = "1") int page,
                           @RequestParam(defaultValue = "8") int size) {
        Page<DongHo> pageDongHo = dongHoService.getDongHoByPage(page, size);
        model.addAttribute("listDongHo", pageDongHo.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", pageDongHo.getTotalPages());
        return "homt";
    }
}

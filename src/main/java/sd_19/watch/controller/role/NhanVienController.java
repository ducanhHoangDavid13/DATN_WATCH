package sd_19.watch.controller.role;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sd_19.watch.model.role.NhanVien;
import sd_19.watch.services.role.NhanVienService;

@Controller
@RequestMapping("/nhanvien")
@RequiredArgsConstructor
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping
    public String listNhanViens(Model model) {
        model.addAttribute("nhanViens", nhanVienService.getAllNhanViens());
        model.addAttribute("mode", "list");
        return "nhanvien";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        model.addAttribute("mode", "add");
        return "nhanvien";
    }

    @PostMapping("/save")
    public String saveNhanVien(@ModelAttribute("nhanVien") @Valid NhanVien nhanVien, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("mode", "add");
            return "nhanvien";
        }
        nhanVienService.saveNhanVien(nhanVien);
        return "redirect:/nhanvien";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        model.addAttribute("nhanVien", nhanVienService.getNhanVienById(id));
        model.addAttribute("mode", "edit");
        return "nhanvien";
    }

    @PostMapping("/update/{id}")
    public String updateNhanVien(@PathVariable Integer id, @ModelAttribute("nhanVien") @Valid NhanVien nhanVien, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("mode", "edit");
            return "nhanvien";
        }
        nhanVienService.saveNhanVien(nhanVien);
        return "redirect:/nhanvien";
    }

    @GetMapping("/delete/{id}")
    public String deleteNhanVien(@PathVariable Integer id) {
        nhanVienService.deleteNhanVien(id);
        return "redirect:/nhanvien";
    }
}

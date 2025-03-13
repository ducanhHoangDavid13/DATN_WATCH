package sd_19.watch.controller.ban_hang;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sd_19.watch.model.san_pham.DongHoChiTiet;
import sd_19.watch.model.san_pham.PhanLoai;
import sd_19.watch.repository.san_pham.PhanLoaiRepository;
import sd_19.watch.services.san_pham.PhanLoaiService;

import java.util.List;

@Controller
@RequestMapping("/phan-loai")
@RequiredArgsConstructor
public class PhanLoaiController {
    @Autowired
    PhanLoaiService phanLoaiService;
    @Autowired
    PhanLoaiRepository phanLoaiRepository;


    @GetMapping()
    public String hienThi(Model model) {
        List<PhanLoai> list = phanLoaiRepository.findAll();
        model.addAttribute("danhSachPhanLoai", list);
        return "phan-loai";
    }

    // API Thêm mới
    @PostMapping("/add")
    public ResponseEntity<PhanLoai> add(@RequestBody PhanLoai phanLoai) {
        phanLoaiRepository.save(phanLoai);
        return ResponseEntity.ok(phanLoai);
    }

    // API Lấy chi tiết theo ID
    @GetMapping("/detail/{id}")
    public ResponseEntity<PhanLoai> detail(@PathVariable Integer id) {
        if (!phanLoaiRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(phanLoaiRepository.findById(id).get());
    }

    // API Cập nhật thông tin
    @PutMapping("/update/{id}")
    public ResponseEntity<PhanLoai> update(@PathVariable Integer id, @RequestBody PhanLoai phanLoai) {
        if (!phanLoaiRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        phanLoai.setId(id);
        phanLoaiRepository.save(phanLoai);
        return ResponseEntity.ok(phanLoai);
    }
}

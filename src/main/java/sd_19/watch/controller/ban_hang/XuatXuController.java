package sd_19.watch.controller.ban_hang;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sd_19.watch.model.san_pham.DongHoChiTiet;
import sd_19.watch.model.san_pham.XuatXu;
import sd_19.watch.repository.san_pham.DongHoChiTietRepository;
import sd_19.watch.repository.san_pham.XuatXuRepository;
import sd_19.watch.services.san_pham.DongHoChiTietService;
import sd_19.watch.services.san_pham.XuatXuService;

import java.util.List;

@Controller
@RequestMapping("/xuat-xu")
@RequiredArgsConstructor
public class XuatXuController {
    @Autowired
    private XuatXuService xuatXuService;

    @Autowired
    private XuatXuRepository xuatXuRepository;

    @GetMapping()
    public String hienThi(Model model) {
        List<XuatXu> list = xuatXuRepository.findAll();
        model.addAttribute("danhSachXuatXu", list);
        return "xuat-xu";
    }

    // API Thêm mới
    @PostMapping("/add")
    public ResponseEntity<XuatXu> add(@RequestBody XuatXu xuatXu) {
        xuatXuRepository.save(xuatXu);
        return ResponseEntity.ok(xuatXu);
    }

    // API Lấy chi tiết theo ID
    @GetMapping("/detail/{id}")
    public ResponseEntity<XuatXu> detail(@PathVariable Integer id) {
        if (!xuatXuRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(xuatXuRepository.findById(id).get());
    }

    // API Cập nhật thông tin
    @PutMapping("/update/{id}")
    public ResponseEntity<XuatXu> update(@PathVariable Integer id, @RequestBody XuatXu xuatXu) {
        if (!xuatXuRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        xuatXu.setId(id);
        xuatXuRepository.save(xuatXu);
        return ResponseEntity.ok(xuatXu);
    }

}

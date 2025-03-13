package sd_19.watch.controller.ban_hang;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sd_19.watch.model.san_pham.DongHoChiTiet;
import sd_19.watch.repository.san_pham.DongHoChiTietRepository;
import sd_19.watch.services.san_pham.DongHoChiTietService;

import java.util.List;

@Controller
@RequestMapping("/dong-ho-chi-tiet")
@RequiredArgsConstructor
public class DongHoChiTietController {
    @Autowired
    private DongHoChiTietService dongHoChiTietService;

    @Autowired
    private DongHoChiTietRepository dongHoChiTietRepository;

    @GetMapping()
    public String hienThi(Model model) {
        List<DongHoChiTiet> list = dongHoChiTietRepository.findAll();
        model.addAttribute("danhSachDongHo", list);
        return "dong-ho-chi-tiet";
    }

    // API Thêm mới
    @PostMapping("/add")
    public ResponseEntity<DongHoChiTiet> add(@RequestBody DongHoChiTiet dongHoChiTiet) {
        dongHoChiTietRepository.save(dongHoChiTiet);
        return ResponseEntity.ok(dongHoChiTiet);
    }

    // API Lấy chi tiết theo ID
    @GetMapping("/detail/{id}")
    public ResponseEntity<DongHoChiTiet> detail(@PathVariable Integer id) {
        if (!dongHoChiTietRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dongHoChiTietRepository.findById(id).get());
    }

    // API Cập nhật thông tin đồng hồ
    @PutMapping("/update/{id}")
    public ResponseEntity<DongHoChiTiet> update(@PathVariable Integer id, @RequestBody DongHoChiTiet dongHoChiTiet) {
        if (!dongHoChiTietRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        dongHoChiTiet.setId(id);
        dongHoChiTietRepository.save(dongHoChiTiet);
        return ResponseEntity.ok(dongHoChiTiet);
    }

//    // API Tìm kiếm / Lọc đồng hồ theo thuộc tính
//    @GetMapping("/search")
//    public String search(@RequestParam(required = false) String tenDongHo,
//                         @RequestParam(required = false) String hang,
//                         @RequestParam(required = false) String phanLoai,
//                         @RequestParam(required = false) String chatLieu,
//                         @RequestParam(required = false) String xuatXu,
//                         Model model) {
//
//        List<DongHoChiTiet> danhSachLoc = dongHoChiTietService.searchByAttribute(tenDongHo, hang, phanLoai, chatLieu, xuatXu);
//        model.addAttribute("danhSachDongHo", danhSachLoc);
//
//        return "dong-ho-chi-tiet";  // Trả về trang danh sách với dữ liệu lọc
//    }
}

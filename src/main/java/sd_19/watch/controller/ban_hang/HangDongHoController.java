package sd_19.watch.controller.ban_hang;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sd_19.watch.model.san_pham.DongHoChiTiet;
import sd_19.watch.model.san_pham.HangDongHo;
import sd_19.watch.repository.san_pham.HangDongHoRepository;
import sd_19.watch.services.san_pham.HangDongHoService;

import java.util.List;

@Controller
@RequestMapping("/hang-dong-ho")
@RequiredArgsConstructor
public class HangDongHoController {
    @Autowired
    private HangDongHoService hangDongHoService;
    @Autowired
    private HangDongHoRepository hangDongHoRepository;

    @GetMapping()
    public String hienThi(Model model) {
        List<HangDongHo> list = hangDongHoRepository.findAll();
        model.addAttribute("danhSachHangDongHo", list);
        return "hang-dong-ho";
    }

    // API Thêm mới
    @PostMapping("/add")
    public ResponseEntity<HangDongHo> add(@RequestBody HangDongHo hangDongHo) {
        hangDongHoRepository.save(hangDongHo);
        return ResponseEntity.ok(hangDongHo);
    }

    // API Lấy chi tiết theo ID
    @GetMapping("/detail/{id}")
    public ResponseEntity<HangDongHo> detail(@PathVariable Integer id) {
        if (!hangDongHoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(hangDongHoRepository.findById(id).get());
    }

    // API Cập nhật thông tin đồng hồ
    @PutMapping("/update/{id}")
    public ResponseEntity<HangDongHo> update(@PathVariable Integer id, @RequestBody HangDongHo hangDongHo) {
        if (!hangDongHoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        hangDongHo.setId(id);
        hangDongHoRepository.save(hangDongHo);
        return ResponseEntity.ok(hangDongHo);
    }

}

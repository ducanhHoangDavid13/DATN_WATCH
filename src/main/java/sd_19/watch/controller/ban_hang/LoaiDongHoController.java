package sd_19.watch.controller.ban_hang;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sd_19.watch.model.san_pham.HangDongHo;
import sd_19.watch.model.san_pham.LoaiDongHo;
import sd_19.watch.repository.san_pham.HangDongHoRepository;
import sd_19.watch.repository.san_pham.LoaiDongHoRepository;
import sd_19.watch.services.san_pham.HangDongHoService;
import sd_19.watch.services.san_pham.LoaiDongHoService;

import java.util.List;

@Controller
@RequestMapping("/loai-dong-ho")
@RequiredArgsConstructor
public class LoaiDongHoController {
    @Autowired
    private LoaiDongHoService loaiDongHoService;
    @Autowired
    private LoaiDongHoRepository loaiDongHoRepository;

    @GetMapping()
    public String hienThi(Model model) {
        List<LoaiDongHo> list = loaiDongHoRepository.findAll();
        model.addAttribute("danhSachLoaiDongHo", list);
        return "loai-dong-ho";
    }

    // API Thêm mới
    @PostMapping("/add")
    public ResponseEntity<LoaiDongHo> add(@RequestBody LoaiDongHo loaiDongHo) {
        loaiDongHoRepository.save(loaiDongHo);
        return ResponseEntity.ok(loaiDongHo);
    }

    // API Lấy chi tiết theo ID
    @GetMapping("/detail/{id}")
    public ResponseEntity<LoaiDongHo> detail(@PathVariable Integer id) {
        if (!loaiDongHoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(loaiDongHoRepository.findById(id).get());
    }

    // API Cập nhật thông tin đồng hồ
    @PutMapping("/update/{id}")
    public ResponseEntity<LoaiDongHo> update(@PathVariable Integer id, @RequestBody LoaiDongHo loaiDongHo) {
        if (!loaiDongHoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        loaiDongHo.setId(id);
        loaiDongHoRepository.save(loaiDongHo);
        return ResponseEntity.ok(loaiDongHo);
    }
}

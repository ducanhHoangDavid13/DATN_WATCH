package sd_19.watch.controller.ban_hang;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sd_19.watch.model.san_pham.ChatLieu;
import sd_19.watch.model.san_pham.DongHoChiTiet;
import sd_19.watch.repository.san_pham.ChatLieuRepository;
import sd_19.watch.repository.san_pham.DongHoChiTietRepository;
import sd_19.watch.services.san_pham.ChatLieuService;
import org.springframework.stereotype.Service;
import sd_19.watch.services.san_pham.DongHoChiTietService;

import java.util.List;

@Controller
@RequestMapping("/chat-lieu")
@RequiredArgsConstructor
public class ChatLieuController {
    @Autowired
    private  ChatLieuService chatLieuService;
    @Autowired
    private ChatLieuRepository chatLieuRepository;

    @GetMapping()
    public String hienThi(Model model) {
        List<ChatLieu> list = chatLieuRepository.findAll();
        model.addAttribute("danhSachChatLieu", list);
        return "chat-lieu";
    }

    // API Thêm mới
    @PostMapping("/add")
    public ResponseEntity<ChatLieu> add(@RequestBody ChatLieu chatLieu) {
        chatLieuRepository.save(chatLieu);
        return ResponseEntity.ok(chatLieu);
    }

    // API Lấy chi tiết theo ID
    @GetMapping("/detail/{id}")
    public ResponseEntity<ChatLieu> detail(@PathVariable Integer id) {
        if (!chatLieuRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(chatLieuRepository.findById(id).get());
    }

    // API Cập nhật thông tin đồng hồ
    @PutMapping("/update/{id}")
    public ResponseEntity<ChatLieu> update(@PathVariable Integer id, @RequestBody ChatLieu chatLieu) {
        if (!chatLieuRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        chatLieu.setId(id);
        chatLieuRepository.save(chatLieu);
        return ResponseEntity.ok(chatLieu);
    }

}

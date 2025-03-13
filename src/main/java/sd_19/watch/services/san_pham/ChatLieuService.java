package sd_19.watch.services.san_pham;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import sd_19.watch.model.san_pham.ChatLieu;
import sd_19.watch.model.san_pham.DongHo;
import sd_19.watch.repository.san_pham.ChatLieuRepository;
import sd_19.watch.repository.san_pham.DongHoRepository;

import java.util.List;

public class ChatLieuService {
    private final ChatLieuRepository chatLieuRepository;

    public ChatLieuService(ChatLieuRepository chatLieuRepository) {
        this.chatLieuRepository = chatLieuRepository;
    }

    public List<ChatLieu> getAllDongHo() {
        return chatLieuRepository.findAll();
    }

    public ChatLieu getChatLieuById(Integer id) {
        return chatLieuRepository.findById(id).orElse(null);
    }

    public ChatLieu saveChatLieu(ChatLieu chatLieu) {
        return chatLieuRepository.save(chatLieu);
    }

    public ChatLieu updateChatLieu(Integer id, ChatLieu updatedChatLieu) {
        if (!chatLieuRepository.existsById(id)) {
            return null;
        }
        updatedChatLieu.setId(id);
        return chatLieuRepository.save(updatedChatLieu);
    }

    public boolean deleteChatLieu(Integer id) {
        if (!chatLieuRepository.existsById(id)) {
            return false;
        }
        chatLieuRepository.deleteById(id);
        return true;
    }

    public List<ChatLieu> findByTen(String loaiChatLieu) {
        return chatLieuRepository.findByLoaiChatLieuContainingIgnoreCase(loaiChatLieu);
    }
    public Page<ChatLieu> getChatLieuByPage(int page, int size) {
        return chatLieuRepository.findAll(PageRequest.of(page - 1, size)); // Spring Boot đánh số trang từ 0
    }
}

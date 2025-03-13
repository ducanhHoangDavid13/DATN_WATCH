package sd_19.watch.repository.san_pham;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.ChatLieu;
import sd_19.watch.model.san_pham.DongHo;
import sd_19.watch.model.san_pham.DongHoChiTiet;

import java.util.List;

@Repository
public interface ChatLieuRepository extends JpaRepository<ChatLieu, Integer> {
    List<ChatLieu> findByLoaiChatLieuContainingIgnoreCase(String loaiChatLieu);
    Page<ChatLieu> findAll(Pageable pageable);
}

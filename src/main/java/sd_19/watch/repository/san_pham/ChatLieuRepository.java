package sd_19.watch.repository.san_pham;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.ChatLieu;

import java.util.List;

@Repository
public interface ChatLieuRepository extends JpaRepository<ChatLieu, Integer> {
    List<ChatLieu> findChatLieuByMaChatLieu(@NotBlank(message = "Mã chất liệu không được để trống") String maChatLieu);
}

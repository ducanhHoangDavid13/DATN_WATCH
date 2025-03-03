package sd_19.watch.model.san_pham;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import sd_19.watch.model.CommonEntity;
@Entity
@Table(name = "chat_lieu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatLieu extends CommonEntity {
    @Column
    @NotEmpty(message = "Khong duoc de trong chat lieu!")
    private String loaiChatLieu;
}

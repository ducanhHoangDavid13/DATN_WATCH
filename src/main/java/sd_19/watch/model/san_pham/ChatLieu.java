package sd_19.watch.model.san_pham;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;

@Entity
@Table(name = "chat_lieu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatLieu extends CommonEntity {

    @NotBlank(message = "Mã chất liệu không được để trống")
    @Column(name = "ma", nullable = false, unique = true)
    private String maChatLieu;
    @Column
    @NotEmpty(message = "Khong duoc de trong chat lieu!")
    private String tenChatLieu;
}

package sd_19.watch.model.san_pham;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
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
    @NotEmpty(message = "Khong duoc de trong loai chat lieu!")
    private String loaiChatLieu;


}

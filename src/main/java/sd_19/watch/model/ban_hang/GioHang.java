package sd_19.watch.model.ban_hang;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
import sd_19.watch.model.role.KhachHang;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gio_hang")
public class GioHang extends CommonEntity {

   @Column(nullable = false, unique = true)
   @NotBlank(message = "Mã không được để trống")
   @Size(min = 3, max = 20, message = "Mã phải từ 3 đến 20 ký tự")
   private String ma;

   @Column(nullable = false)
   @PastOrPresent(message = "Ngày tạo không thể ở tương lai")
   private Date ngayTao;
}

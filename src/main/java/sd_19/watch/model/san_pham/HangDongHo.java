package sd_19.watch.model.san_pham;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hang_dong_ho")
public class HangDongHo extends CommonEntity {
    @NotBlank(message = "Mã hãng đồng hồ không được để trống")
    @Column(name = "ma", nullable = false, unique = true)
    private String maHang;
    @Column(name="ten_hang")
    @NotBlank(message = "Tên hãng đồng hồ không được để trống")
    private String tenHang;

}

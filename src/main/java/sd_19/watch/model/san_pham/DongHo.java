package sd_19.watch.model.san_pham;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
@Entity
@Table(name = "dong_ho")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DongHo extends CommonEntity {

    @Column(nullable = false)
    @NotBlank(message = "Tên đồng hồ không được để trống")
    @Size(min = 2, max = 100, message = "Tên đồng hồ phải từ 2 đến 100 ký tự")
    private String tenDongHo;

    @NotBlank(message = "Mã đồng hồ không được để trống")
    @Column(name = "ma_dong_ho", nullable = false, unique = true)
    private String maDongHo;

    @Column(nullable = false, columnDefinition = "TEXT")
    @NotBlank(message = "Mô tả không được để trống")
    @Size(min = 10, message = "Mô tả phải có ít nhất 10 ký tự")
    private String moTa;

    @Column(nullable = false)
    @NotBlank(message = "Hình ảnh không được để trống")
    private String hinhAnh;
}

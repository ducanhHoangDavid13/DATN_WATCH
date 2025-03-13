package sd_19.watch.model.san_pham;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "loai_dong_ho")
public class LoaiDongHo extends CommonEntity {
    @NotBlank(message = "Mã loại đồng hồ không được để trống")
    @Column(name = "ma", nullable = false, unique = true)
    private String maLoai;
    @Column(name="ten_loai")
    @NotBlank(message = "Tên loại đồng hồ không được để trống")
    private String tenLoai;
}

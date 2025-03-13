package sd_19.watch.model.san_pham;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "xuat_xu")
public class XuatXu extends CommonEntity {
    @NotBlank(message = "Mã xuất xứ đồng hồ không được để trống")
    @Column(name = "ma", nullable = false, unique = true)
    private String maXuatXu;
    @Column
    @NotNull(message = "Xuất xứ không được để trống")
    private String loaiXuatXu;

}

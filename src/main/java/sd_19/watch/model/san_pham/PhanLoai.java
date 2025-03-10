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
@Table(name = "phan_loai")
public class PhanLoai extends CommonEntity {
    @NotBlank(message = "Mã phân loại không được để trống")
    @Column(name = "ma", nullable = false, unique = true)
    private String maPhanLoai;
    @Column
   private String tenPhanLoai;
}

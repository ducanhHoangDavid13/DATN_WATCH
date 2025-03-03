package sd_19.watch.model.san_pham;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
   @Column private String tenDongHo;
  @Column private String moTa;
   @Column private String hinhAnh;
}

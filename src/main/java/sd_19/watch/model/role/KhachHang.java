package sd_19.watch.model.role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "khach_hang")
public class KhachHang extends CommonEntity {
   @Column
   private String maKhachHang;
  @Column  private String matKhau;
  @Column  private String hoVaTen;
  @Column  private String email;
  @Column  private Boolean gioiTinh;
  @Column  private String soDienThoai;
}

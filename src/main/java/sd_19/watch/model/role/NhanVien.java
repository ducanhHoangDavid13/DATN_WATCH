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
@Table(name = "nhan_vien")
public class NhanVien extends CommonEntity {

   @Column private String maNhanVien;
   @Column private String tenNhanVien;
   @Column private String matKhau;
   @Column private String email;
   @Column private Boolean gioiTinh;
   @Column private String sdt;
  @Column  private String diaChi;
}

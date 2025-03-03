package sd_19.watch.model.ban_hang;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
import sd_19.watch.model.role.KhachHang;
import sd_19.watch.model.role.NhanVien;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hoa_don")
public class HoaDon extends CommonEntity {
    @ManyToOne
    @JoinColumn(name = "id_nhan_vien")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    private KhachHang khachHang;

   @Column
   private String maHoaDon;
   @Column private Date ngayTao;
  @Column  private Boolean loai;
  @Column  private BigDecimal tongTien;
  @Column  private String ghiChu;
}

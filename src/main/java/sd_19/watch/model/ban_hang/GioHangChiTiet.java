package sd_19.watch.model.ban_hang;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
import sd_19.watch.model.san_pham.DongHoChiTiet;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gio_hang_chi_tiet")
public class GioHangChiTiet extends CommonEntity {
    @ManyToOne
    @JoinColumn(name = "id_dong_ho_chi_tiet")
    private DongHoChiTiet dongHoChiTiet;

    @ManyToOne
    @JoinColumn(name = "id_gio_hang")
    private GioHang gioHang;

 @Column
 private BigDecimal giaTien;
  @Column  private Date ngaySua;
  @Column  private Date thoiGianVoucher;
 @Column   private Integer soLuong;
 @Column   private Date ngayTao;
}

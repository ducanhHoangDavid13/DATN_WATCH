package sd_19.watch.model.ban_hang;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hinh_thuc_thanh_toan")
public class HinhThucThanhToan extends CommonEntity {
    @ManyToOne
    @JoinColumn(name = "id_hoa_don_chi_tiet")
    private HoaDonChiTiet hoaDonChiTiet;

  @Column
  private String hinhThucThanhToan;
   @Column private BigDecimal soTien;
}

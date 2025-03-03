package sd_19.watch.model.ban_hang;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
import sd_19.watch.model.role.NhanVien;
import sd_19.watch.model.san_pham.DongHoChiTiet;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hoa_don_chi_tiet")
public class HoaDonChiTiet extends CommonEntity {
    @ManyToOne
    @JoinColumn(name = "id_dong_ho_chi_tiet")
    private DongHoChiTiet dongHoChiTiet;

    @ManyToOne
    @JoinColumn(name = "id_nhan_vien")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "id_hoa_don")
    private HoaDon hoaDon;

    private String maHoaDonChiTiet;
    private Integer tienGiamGia;
    private String ghiChu;
}

package sd_19.watch.model.ban_hang;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @JoinColumn(name = "id_dong_ho_chi_tiet", nullable = false)
    @NotNull(message = "Đồng hồ chi tiết không được để trống")
    private DongHoChiTiet dongHoChiTiet;

    @ManyToOne
    @JoinColumn(name = "id_nhan_vien", nullable = false)
    @NotNull(message = "Nhân viên không được để trống")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "id_hoa_don", nullable = false)
    @NotNull(message = "Hóa đơn không được để trống")
    private HoaDon hoaDon;

    @NotBlank(message = "Mã hóa đơn chi tiết không được để trống")
    @Column(name = "ma_hoa_don_chi_tiet", nullable = false, unique = true)
    private String maHoaDonChiTiet;

    @NotNull(message = "Tiền giảm giá không được để trống")
    @Min(value = 0, message = "Tiền giảm giá phải lớn hơn hoặc bằng 0")
    @Column(name = "tien_giam_gia", nullable = false)
    private Integer tienGiamGia;

    @Column(name = "ghi_chu")
    private String ghiChu;
}

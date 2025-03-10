package sd_19.watch.model.ban_hang;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @JoinColumn(name = "id_nhan_vien", nullable = false)
    @NotNull(message = "Nhân viên không được để trống")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang", nullable = false)
    @NotNull(message = "Khách hàng không được để trống")
    private KhachHang khachHang;

    @NotBlank(message = "Mã hóa đơn không được để trống")
    @Column(name = "ma_hoa_don", nullable = false, unique = true)
    private String maHoaDon;

    @NotNull(message = "Ngày tạo không được để trống")
    @Column(name = "ngay_tao", nullable = false)
    private Date ngayTao;

    @NotNull(message = "Loại hóa đơn không được để trống")
    @Column(name = "loai", nullable = false)
    private Boolean loai;

    @NotNull(message = "Tổng tiền không được để trống")
    @DecimalMin(value = "0.0", message = "Tổng tiền phải lớn hơn hoặc bằng 0")
    @Column(name = "tong_tien", nullable = false)
    private BigDecimal tongTien;

    @Column(name = "ghi_chu")
    private String ghiChu;
}

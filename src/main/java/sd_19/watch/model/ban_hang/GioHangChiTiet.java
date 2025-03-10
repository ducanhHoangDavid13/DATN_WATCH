package sd_19.watch.model.ban_hang;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
import sd_19.watch.model.role.KhachHang;
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
    @JoinColumn(name = "id_dong_ho_chi_tiet", nullable = false)
    @NotNull(message = "Đồng hồ chi tiết không được để trống")
    private DongHoChiTiet dongHoChiTiet;

    @ManyToOne
    @JoinColumn(name = "id_gio_hang", nullable = false)
    @NotNull(message = "Giỏ hàng không được để trống")
    private GioHang gioHang;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    private KhachHang khachHang;

    @NotNull(message = "Giá tiền không được để trống")
    @DecimalMin(value = "0.0", message = "Giá tiền phải lớn hơn hoặc bằng 0")
    @Column(name = "gia_tien", nullable = false)
    private BigDecimal giaTien;

    @NotNull(message = "Ngày sửa không được để trống")
    @Column(name = "ngay_sua", nullable = false)
    private Date ngaySua;

    @Column(name = "thoi_gian_voucher")
    private Date thoiGianVoucher;

    @NotNull(message = "Số lượng không được để trống")
    @Min(value = 1, message = "Số lượng phải lớn hơn hoặc bằng 1")
    @Column(name = "so_luong", nullable = false)
    private Integer soLuong;

    @NotNull(message = "Ngày tạo không được để trống")
    @Column(name = "ngay_tao", nullable = false)
    private Date ngayTao;
}

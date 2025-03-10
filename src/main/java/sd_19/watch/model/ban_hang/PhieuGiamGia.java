package sd_19.watch.model.ban_hang;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
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
@Table(name = "phieu_giam_gia1")
public class PhieuGiamGia extends CommonEntity {

    @NotBlank(message = "Mã phiếu giảm giá không được để trống")
    @Column(name = "ma_phieu_giam_gia", nullable = false, unique = true)
    private String maPhieuGiamGia;

    @NotBlank(message = "Tên phiếu giảm giá không được để trống")
    @Column(name = "ten_phieu_giam_gia", nullable = false)
    private String tenPhieuGiamGia;

    @NotNull(message = "Số lượng không được để trống")
    @Min(value = 1, message = "Số lượng phải lớn hơn hoặc bằng 1")
    @Column(name = "so_luong", nullable = false)
    private Integer soLuong;

    @NotNull(message = "Mức giảm không được để trống")
    @DecimalMin(value = "0.0", message = "Mức giảm phải lớn hơn hoặc bằng 0")
    @Column(name = "muc_giam", nullable = false)
    private BigDecimal mucGiam;

    @NotNull(message = "Điều kiện sử dụng không được để trống")
    @Column(name = "dieu_kien_su_dung", nullable = false)
    private BigDecimal dieuKienSuDung;

    @Column(name = "gia_tri_toi_da")
    private BigDecimal giaTriToiDa;

    @NotNull(message = "Hình thức giảm giá không được để trống")
    @Column(name = "hinh_thuc_giam_gia", nullable = false)
    private Integer hinhThucGiamGia;

    @NotNull(message = "Ngày bắt đầu không được để trống")
    @Column(name = "ngay_bat_dau", nullable = false)
    private LocalDate ngayBatDau;

    @NotNull(message = "Ngày kết thúc không được để trống")
    @Column(name = "ngay_ket_thuc", nullable = false)
    private LocalDate ngayKetThuc;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @NotNull(message = "Trạng thái không được để trống")
    @Column(name = "trang_thai", nullable = false)
    private Integer trangThai;
}


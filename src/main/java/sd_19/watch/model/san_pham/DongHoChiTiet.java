package sd_19.watch.model.san_pham;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;

import java.math.BigDecimal;

@Entity
@Table(name = "dong_ho_chi_tiet")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DongHoChiTiet extends CommonEntity {
    @ManyToOne
    @JoinColumn(name = "id_dong_ho", nullable = false)
    @NotNull(message = "Đồng hồ không được để trống")
    private DongHo dongHo;

    @ManyToOne
    @JoinColumn(name = "id_phan_loai", nullable = false)
    @NotNull(message = "Phân loại không được để trống")
    private PhanLoai phanLoai;

    @ManyToOne
    @JoinColumn(name = "id_xuat_xu", nullable = false)
    @NotNull(message = "Xuất xứ không được để trống")
    private XuatXu xuatXu;

    @ManyToOne
    @JoinColumn(name = "id_hang_dong_ho", nullable = false)
    @NotNull(message = "Hãng đồng hồ không được để trống")
    private HangDongHo hangDongHo;

    @ManyToOne
    @JoinColumn(name = "id_chat_lieu", nullable = false)
    @NotNull(message = "Chất liệu không được để trống")
    private ChatLieu chatLieu;

    @ManyToOne
    @JoinColumn(name = "id_loai", nullable = false)
    @NotNull(message = "Loại đồng hồ không được để trống")
    private LoaiDongHo loaiDongHo;

    @Column(nullable = false)
    @NotNull(message = "Giá tiền không được để trống")
    @Min(value = 100000, message = "Giá tiền phải lớn hơn 100,000 VND")
    private Double giaTien;

    @Column(nullable = false)
    @NotNull(message = "Giới tính không được để trống")
    @Pattern(regexp = "^(Nam|Nữ|Unisex)$", message = "Giới tính chỉ có thể là Nam, Nữ hoặc Unisex")
    private String gioiTinh;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Số serial không được để trống")
    @Size(min = 5, max = 50, message = "Số serial phải từ 5 đến 50 ký tự")
    private String soSerial;

    @Column(nullable = false)
    @NotNull(message = "Trạng thái không được để trống")
    @Min(value = 0, message = "Trạng thái phải là 0 (Không hoạt động) hoặc 1 (Hoạt động)")
    @Max(value = 1, message = "Trạng thái phải là 0 (Không hoạt động) hoặc 1 (Hoạt động)")
    private Integer trangThai;

}

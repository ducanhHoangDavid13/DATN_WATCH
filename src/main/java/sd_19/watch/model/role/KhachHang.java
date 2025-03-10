package sd_19.watch.model.role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "khach_hang")
public class KhachHang extends CommonEntity {
    @Column(nullable = false, unique = true)
    @NotBlank(message = "Mã khách hàng không được để trống")
    private String maKhachHang;

    @Column(nullable = false)
    @NotBlank(message = "Mật khẩu không được để trống")
    @Size(min = 6, message = "Mật khẩu phải có ít nhất 6 ký tự")
    private String matKhau;

    @Column(nullable = false)
    @NotBlank(message = "Họ và tên không được để trống")
    @Size(min = 3, max = 50, message = "Họ và tên phải từ 3 đến 50 ký tự")
    private String hoVaTen;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @Column(nullable = false)
    @NotNull(message = "Giới tính không được để trống")
    private Boolean gioiTinh;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Số điện thoại không được để trống")
    @Pattern(regexp = "0[0-9]{9,10}", message = "Số điện thoại phải bắt đầu bằng 0 và có 10-11 số")
    private String soDienThoai;
}

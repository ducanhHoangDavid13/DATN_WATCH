package sd_19.watch.model.role;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends CommonEntity {
    @Column(name = "user_name", nullable = false, unique = true, length = 255)
@NotBlank(message = "Tên người dùng không được để trống")
@Size(min = 3, max = 255, message = "Tên người dùng phải từ 3 đến 255 ký tự")
private String userName;

    @Column(nullable = false, unique = true, length = 255)
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @Column(name = "phone_number", nullable = false, length = 20)
    @NotBlank(message = "Số điện thoại không được để trống")
    @Pattern(regexp = "^\\+?[0-9]{10,20}$", message = "Số điện thoại không hợp lệ")
    private String phoneNumber;

    @Column(nullable = false, length = 255)
    @NotBlank(message = "Mật khẩu không được để trống")
    @Size(min = 6, message = "Mật khẩu phải có ít nhất 6 ký tự")
    private String password;

    @Column(nullable = false)
    private Boolean enabled;
}

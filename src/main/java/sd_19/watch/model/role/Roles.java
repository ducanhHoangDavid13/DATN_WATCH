package sd_19.watch.model.role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
@Data
@Entity
@Table(name = "role")
@AllArgsConstructor
@NoArgsConstructor
public class Roles extends CommonEntity {
    @Column(nullable = false, unique = true, length = 50)
    @NotBlank(message = "Tên quyền không được để trống")
    @Size(min = 3, max = 50, message = "Tên quyền phải từ 3 đến 50 ký tự")
    private String name;
}

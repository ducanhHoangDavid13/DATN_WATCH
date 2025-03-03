package sd_19.watch.model.san_pham;
import jakarta.persistence.Column;
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
@Table(name = "hang_dong_ho")
public class HangDongHo extends CommonEntity {
    @Column
    private String tenHang;
}

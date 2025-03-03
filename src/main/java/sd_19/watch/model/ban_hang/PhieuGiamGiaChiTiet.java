package sd_19.watch.model.ban_hang;

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
@Table(name = "phieu_giam_gia_chi_tiet")
public class PhieuGiamGiaChiTiet extends CommonEntity {
}

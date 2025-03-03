package sd_19.watch.model.ban_hang;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sd_19.watch.model.CommonEntity;
import sd_19.watch.model.role.KhachHang;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gio_hang")
public class GioHang extends CommonEntity {
    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    private KhachHang khachHang;
   @Column
   private String ma;
   @Column private Date ngayTao;
}

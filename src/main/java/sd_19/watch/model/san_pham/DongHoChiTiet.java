package sd_19.watch.model.san_pham;

import jakarta.persistence.*;
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
    @JoinColumn(name = "id_dong_ho")
    private DongHo dongHo;

    @ManyToOne
    @JoinColumn(name = "id_phan_loai")
    private Phan_Loai phanLoai;

    @ManyToOne
    @JoinColumn(name = "id_thuong_hieu")
    private XuatXu thuongHieu;

    @ManyToOne
    @JoinColumn(name = "id_hang_dong_ho")
    private HangDongHo hangDongHo;

    @ManyToOne
    @JoinColumn(name = "id_chat_lieu")
    private ChatLieu chatLieu;

   @Column
   private BigDecimal giaTien;
   @Column private Integer gioiTinh;
   @Column private String chucNang;

}

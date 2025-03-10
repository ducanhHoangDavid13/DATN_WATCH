package sd_19.watch.repository.san_pham;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.HangDongHo;

import java.util.List;

@Repository
public interface HangDongHoRepository extends JpaRepository<HangDongHo,Integer> {
    List<HangDongHo> findHangDongHoByMaHang(@NotBlank(message = "Mã hãng đồng hồ không được để trống") String maHang);
}

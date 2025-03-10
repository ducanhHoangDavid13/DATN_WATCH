package sd_19.watch.repository.san_pham;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.*;

import java.util.List;

@Repository
public interface DongHoChiTietRepository extends JpaRepository<DongHoChiTiet, Integer> {
    List<DongHoChiTiet> findByDongHo_TenDongHoContainingIgnoreCase(String tenDongHo);

    List<DongHoChiTiet> findByHangDongHo_TenHangContainingIgnoreCase(String tenHang);

    List<DongHoChiTiet> findByPhanLoai_TenPhanLoaiContainingIgnoreCase(String tenPhanLoai);

    List<DongHoChiTiet> findByChatLieu_TenChatLieuContainingIgnoreCase(String tenChatLieu);

    List<DongHoChiTiet> findByXuatXu_TenXuatXuContainingIgnoreCase(String tenXuatXu);
}

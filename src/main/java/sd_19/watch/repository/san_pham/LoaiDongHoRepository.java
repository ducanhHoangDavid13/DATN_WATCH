package sd_19.watch.repository.san_pham;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.LoaiDongHo;
import sd_19.watch.model.san_pham.PhanLoai;

import java.util.List;

@Repository
public interface LoaiDongHoRepository extends JpaRepository<LoaiDongHo, Integer> {
    List<LoaiDongHo> findByTenLoaiDongHoContainingIgnoreCase(String tenPhanLoai);
    Page<LoaiDongHo> findAll(Pageable pageable);
}

package sd_19.watch.repository.san_pham;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.DongHo;
import java.util.List;

@Repository
public interface DongHoRepository extends JpaRepository<DongHo,Integer> {
    List<DongHo> findByTenDongHoContainingIgnoreCase(String tenDongHo);
    Page<DongHo> findAll(Pageable pageable);
}

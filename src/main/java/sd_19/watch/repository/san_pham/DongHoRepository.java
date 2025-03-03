package sd_19.watch.repository.san_pham;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.DongHo;
@Repository
public interface DongHoRepository extends JpaRepository<DongHo,Integer> {
}

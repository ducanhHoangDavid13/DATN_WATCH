package sd_19.watch.repository.ban_hang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.ban_hang.HinhThucThanhToan;

@Repository
public interface HinhThucThanhToanRepository extends JpaRepository<HinhThucThanhToan,Integer> {
}

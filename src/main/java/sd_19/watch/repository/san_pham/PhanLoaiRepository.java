package sd_19.watch.repository.san_pham;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.Phan_Loai;
@Repository
public interface PhanLoaiRepository extends JpaRepository<Phan_Loai,Integer> {
}

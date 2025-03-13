package sd_19.watch.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.role.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
}

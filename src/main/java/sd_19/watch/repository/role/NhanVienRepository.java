package sd_19.watch.repository.role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.role.NhanVien;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, Integer> {
}

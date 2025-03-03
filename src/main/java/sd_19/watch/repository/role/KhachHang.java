package sd_19.watch.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHang extends JpaRepository<KhachHang, Integer> {
}

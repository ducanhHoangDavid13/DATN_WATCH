package sd_19.watch.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRole extends JpaRepository<UserRole, Integer> {
}

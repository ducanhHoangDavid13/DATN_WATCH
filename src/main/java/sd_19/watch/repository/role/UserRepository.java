package sd_19.watch.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.role.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

package sd_19.watch.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.role.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Tìm kiếm người dùng theo userName
    Optional<User> findByUserName(String userName);

    // Tìm kiếm người dùng theo email (hỗ trợ đăng nhập bằng Google/Facebook)
    Optional<User> findByEmail(String email);

    // Kiểm tra sự tồn tại của userName
    boolean existsByUserName(String userName);

    // Kiểm tra sự tồn tại của email
    boolean existsByEmail(String email);
}

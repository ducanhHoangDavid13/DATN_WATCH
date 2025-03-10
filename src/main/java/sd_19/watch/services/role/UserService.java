package sd_19.watch.services.role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sd_19.watch.config.JWTUtils;
import sd_19.watch.model.role.User;
import sd_19.watch.repository.role.UserRepository;

@Service
public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUserName(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//        return org.springframework.security.core.userdetails.User
//                .withUsername(user.getUserName())
//                .password(user.getPassword())
//                .authorities("USER") // Có thể thay bằng role từ DB
//                .build();
//    }
//
//    public String login(String username, String password) {
//        User user = userRepository.findByUserName(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//        if (passwordEncoder.matches(password, user.getPassword())) {
//            return new JWTUtils().generateToken(username);
//        }
//        throw new RuntimeException("Invalid credentials");
//    }
}

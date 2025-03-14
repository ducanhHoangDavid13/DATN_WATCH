//package sd_19.watch.config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//@Configuration
//@EnableWebSecurity
//public class SercurityConfig {
//    @Autowired
//    private JwtAuthenticationFilter jwtAuthenticationFilter;
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeHttpRequests((requests) -> requests
//                        .requestMatchers("/registration/**").permitAll()
//                        .requestMatchers("/login/**").permitAll()
//                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
//                        .requestMatchers("/admin/**").hasAnyRole("ADMIN")
//                        .anyRequest().authenticated()
//                )
//                .formLogin((form) -> form
//                        .loginPage("/login")
//                        .loginProcessingUrl("/login")
//                        .defaultSuccessUrl("/user/")
//                        .permitAll()
//                )
//                .logout((logout) -> logout.permitAll())
//                .exceptionHandling().accessDeniedPage("/access-denied");
//        return http.build();
//    }
//}

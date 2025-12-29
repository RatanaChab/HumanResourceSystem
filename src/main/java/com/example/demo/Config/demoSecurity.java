//package com.example.demo.config;
//
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationFilter;
//import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebSecurity
//public class demoSecurity {
//
//	@Bean
//	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http.csrf(csrf -> csrf
//						.ignoringRequestMatchers(PathRequest.toH2Console()))
//				.headers(headers -> headers
//						.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable)).
//				httpBasic(withDefaults()).
//				authorizeHttpRequests(request ->
//						request.requestMatchers("/h2-console/**", "/swagger-ui/**").permitAll()
//								.requestMatchers("/").authenticated())
//				.formLogin(withDefaults())
//				.logout(logout ->
//						logout.logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler())
//								.invalidateHttpSession(true)
//								.deleteCookies("JSESSIONID"));
//		return http.build();
//	}
//
//	@Bean
//	UserDetailsService users(PasswordEncoder passwordEncoder) {
//
//		UserDetails user = User.withUsername("user")
//				.password(passwordEncoder.encode("password"))
//				.roles("USER")
//				.build();
//		return new InMemoryUserDetailsManager(user);
//	}
//
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//}

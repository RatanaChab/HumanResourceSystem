//package com.example.demo.config;
//
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Objects;
//
//public class RatanaAuthenticationProvider implements AuthenticationProvider {
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//
//        if (Objects.equals(authentication.getName(), "ratana")){
//            UserDetails ratana = User.withUsername("ratana")
//                    .password("~~~~ingore~~~~")
//                    .roles("user")
//                    .build();
//            return UsernamePasswordAuthenticationToken.authenticated(
//                    ratana,
//                    null,
//                    ratana.getAuthorities()
//            );
//        }
//        return null;
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
//    }
//}

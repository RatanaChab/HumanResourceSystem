//package com.example.demo.config;
//
//import org.springframework.security.authentication.AbstractAuthenticationToken;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//
//import java.util.Collection;
//
//public class AppdofilterToken extends AbstractAuthenticationToken {
//
//
//    public AppdofilterToken() {
//        super(AuthorityUtils.createAuthorityList("ROLE_fuck"));
//    }
//
//    @Override
//    public Object getCredentials() {
//        return null;
//    }
//
//    @Override
//    public Object getPrincipal() {
//        return "Mr fuck you";
//    }
//
//    @Override
//    public boolean isAuthenticated() {
//        return true;
//    }
//
//    @Override
//    public void setAuthenticated(boolean authenticated) {
//        throw new RuntimeException("asdasdasdas");
//    }
//}

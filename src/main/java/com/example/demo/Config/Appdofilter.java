//package com.example.demo.config;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//import java.util.Collections;
//import java.util.Objects;
//
//public class Appdofilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(
//            HttpServletRequest request,
//            HttpServletResponse response,
//            FilterChain filterChain) throws ServletException, IOException {
//        // 1. Decide whether the filter should be applied.
//        System.out.println(request.getHeaderNames());
////        if (!Collections.list(request.getHeaderNames()).contains("admin")){
////            filterChain.doFilter(request,response);
////            return;
////        }
//
//
////        if (!Objects.equals(request.getHeader("x-robot-secret"),("beep-loop"))) {
////            // reject
////            response.setStatus(HttpStatus.FORBIDDEN.value());
////            response.setCharacterEncoding("UTF-8");
////            response.setStatus(HttpStatus.FORBIDDEN.value());
////            response.getWriter().write("Fuck you bitch");
////
////            return ;
////        }
//
//        var auth = new AppdofilterToken();
//        var newContext = SecurityContextHolder.getContext();
//        newContext.setAuthentication(auth);
//        SecurityContextHolder.setContext(newContext);
//
//        // 2. Apply filter: Authenticate or reject request
//
//        // 3. Invoke the "rest" of the chain
//
//        // 4. No cleanUp
//        System.out.println("Application Filter start.");
//
//        filterChain.doFilter(request,response);
//    }
//}

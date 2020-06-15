//package com.example.games.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.stereotype.Controller;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.inMemoryAuthentication()
//                .withUser("katya").password("katya").roles("USER")
//                .and()
//                .withUser("dima").password("dima").roles("ADMIN");
//    }
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers("/").hasRole("USER")
////                .antMatchers("/delete").hasRole("ADMIN")
////                .and()
////                .formLogin()
////                .loginPage("/showLoginPage")
////                .loginProcessingUrl("/authenticateTheUser")
////                .permitAll()
////                .and()
////                .logout()
////                .permitAll();
////               // .and()
////                //.exceptionHandling().accessDeniedPage("/accessDenied");
//
//}

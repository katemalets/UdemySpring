package spring.security.course.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       UserBuilder users = User.withDefaultPasswordEncoder();
       auth.inMemoryAuthentication()
               .withUser(users.username("katya").password("katya").roles("EMPLOYEE"))
               .withUser(users.username("dima").password("dima").roles("MANAGER"))
               .withUser(users.username("Masha").password("masha").roles("ADMIN"));
    }
}

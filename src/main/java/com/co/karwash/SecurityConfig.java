package com.co.karwash;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
        .withUser("Admin")
         .password("{noop}1234")
         .roles("ADMIN","USER")
         .and()
         .withUser("user")
         .password("{noop}123")
         .roles("USER");



    }
    @Override
    protected void configure (HttpSecurity http) throws Exception {
         http.authorizeRequests()
         .antMatchers("/loginadmin")
         .hasRole("ADMIN")
         .and()
         .formLogin()
         .loginPage("/login")
         .defaultSuccessUrl("/loginadmin")
          .permitAll();
    }
}

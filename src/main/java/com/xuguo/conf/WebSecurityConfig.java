package com.xuguo.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * configure Authentication
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("admin")
            .password("admin")
            .roles("ADMIN");
    }

    /**
     * configure authorization
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .csrf().disable()
        .cors().disable()
        .headers().disable()
        .authorizeRequests().antMatchers("/**", "/static/**").permitAll() //public path
        .anyRequest().authenticated()
        .and()
        .formLogin().loginPage("/login") //login request mapping
        .defaultSuccessUrl("/admin") //redirect after successfully login
        .permitAll()
        .and()
        .logout().logoutSuccessUrl("/login")
        .permitAll();
    }
}

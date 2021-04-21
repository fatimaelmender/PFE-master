package com.example.Report_UTRF.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;
@Bean
    AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        return provider;
    }

    @Override

    protected void configure(HttpSecurity http) throws Exception {

    //http.httpBasic();
       http.authorizeRequests().antMatchers("/user").hasAnyRole("usr","admin")
.antMatchers("/").permitAll().and().formLogin();
             // .antMatchers(HttpMethod.OPTIONS ,"/**")
             //  .hasAnyAuthority("USER","ADMIN");


               /*.antMatchers("/user/**")
               .hasAuthority("USER")
               .antMatchers("/admin/**")
               .hasAuthority("ADMIN");*/
               http.authorizeRequests().anyRequest().authenticated();
               http.exceptionHandling().accessDeniedPage("/NoAuthorized");
           /*    .anyRequest().authenticated()
               .and()
               .formLogin().permitAll()
               .and()
               .logout().permitAll();*/
    }


}

package com.customer.config;

import com.customer.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

/**
 * @author oujian
 * create by 2019/1/23
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userService)
                .passwordEncoder(passwordEncoderBean());
    }
    @Bean
    public PasswordEncoder passwordEncoderBean() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //指定拦截路径
        http
                .formLogin().loginPage("/user/login").loginProcessingUrl("/login/form").failureUrl("/login-error").permitAll()  //表单登录，permitAll()表示这个不需要验证 登录页面，登录失败页面
                .and()
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .csrf().disable();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder authentication) throws Exception{
        authentication.inMemoryAuthentication()
                //设置最高权限用户
                .withUser("uygnoguy").password("beijixiong157").roles("ADMIN");
        authentication.jdbcAuthentication().dataSource(dataSource);

    }



}

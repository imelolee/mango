package com.example.mango.admin.config;

import com.example.mango.admin.security.JwtAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Spring Security配置
 * @author genleel
 */
@Configuration
@EnableWebSecurity // 开启Spring Security
@EnableGlobalMethodSecurity(prePostEnabled = true) // 开启权限注解
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public void configure(AuthenticationManagerBuilder auth){
        // 使用自定义身份验证插件
        auth.authenticationProvider(new JwtAuthenticationProvider(userDetailsService));
    }
}

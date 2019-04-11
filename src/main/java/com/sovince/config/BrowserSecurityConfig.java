package com.sovince.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/11
 * Time: 19:25
 * Description:
 */
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        http.formLogin().and()
                .authorizeRequests()
                .antMatchers("/NotUsefulSecurity")
                .authenticated();
    }
}

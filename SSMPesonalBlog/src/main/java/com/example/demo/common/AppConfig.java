package com.example.demo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig implements WebMvcConfigurer {
    @Autowired
    private Logininterceptor logininterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //不拦截url集合
        List<String> excludes =new ArrayList<String>(){{
            add("/**/*.html");
            add("/js/**");
            add("/editor.md/**");
            add("/css/**");

            add("/img/**");//放行 static/img 下的所有文件
            add("/user/login");//放心登录接口
            add("/user/reg");//旅行注册接口


        }} ;

        //配置拦截器
        InterceptorRegistration registration =
        registry.addInterceptor(logininterceptor);
        registration.addPathPatterns("/**");
        registration.excludePathPatterns(excludes);
    }
}

//package com.mwgroup.background.config;
//
//import com.mwgroup.background.config.interceptor.LoginInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Autowired
//    private LoginInterceptor loginInterceptor;
//
//
//
//    @Override
//
//    public void addInterceptors(InterceptorRegistry registry) {
//
//        // addPathPatterns("/**") 表示拦截所有的请求，
//
//        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
//
//        registry.addInterceptor(loginInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/mw/user/login");
//
//        //super.addInterceptors(registry);    //较新Spring Boot的版本中这里可以直接去掉，否则会报错
//
//    }
//
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry){
//
//    }
//
//}

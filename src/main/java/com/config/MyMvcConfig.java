package com.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ctrl+o 出现可重写的方法
 * */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /* 视图跳转控制器 */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
    /* 拦截器配置 ,注册拦截器*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/Login","/js/**","/css/**","/images/**");
    }
//    /* 视图解析器 */
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//
//    }
//
//    // 所有的WebMvcConfigurerAdapter组件都会一起起作用
//    @Bean
//    public WebMvcConfigurer webMvcConfigurer() {
//        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("index");
//                registry.addViewController("/index.html").setViewName("index");
//                registry.addViewController("/dashboard").setViewName("dashboard");
//            }
//        };
//        return webMvcConfigurer;
//    }

}

package org.galsang.admin.config;

import org.galsang.util.web.spring.interceptor.ClientHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Description： WebMvc配置文件
 * <br />Author： vimx86
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ClientHandlerInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 转向型控制器的简化应用配置  控制器名称  ==========  导向视图名称
//        registry.addViewController("/layout").setViewName("/pages/common/_layout");
//        registry.addViewController("/users").setViewName("/pages/users");
    }

}

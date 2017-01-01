package com.archy.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
  * @ClassName: WebConfig
  * @Description: Spring MVC 的 Java 配置类
  * @author Archy技术部-huang
  * @date 2016年12月30日 下午09:44:41
 */
@Configuration
@EnableWebMvc  // 有此注解的类就是最简单的 Spring MVC 配置;  启用 Spring MVC
@ComponentScan("com.archy.spittr.web")   // 启用组件扫描
public class WebConfig
        extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {
        // 配置 JSP 视图解析器
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
//        resolver.setViewClass(JstlView.class); 可以解析为 JSTLView 对象，使用 相关语法
        return resolver;
    }
    /**
     * XML 的配置方式如下：
     * <bean id="viewResolver" class="org.springFramework.web.servlet.view.InternalResourceViewResolver"
     *  p:prefix="/WEB-INF/views/"
     *  p:suffix=".jsp" />
     */

    /**
     * 配置静态资源的处理
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {

        configurer.enable();  // enable() 将要求 DispatcherServlet 将对静态资源的请求转发到 Servlet 容器中默认的 Servlet 上，而不是使用 DispatcherServlet 本身来处理此类请求
    }

}

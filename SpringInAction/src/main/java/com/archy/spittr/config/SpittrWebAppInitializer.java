package com.archy.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Created by huang on 2016/11/23.
 */
public class SpittrWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 只要实现了 AbstractAnnotationConfigDispatcherServletInitializer 的任意类都会自动地配置 DispatcherServlet 和
     * Spring 上下文， Spring 的应用上下文会位于应用程序的 Servlet 上下文之中。
     * 实际上，AbstractAnnotationConfigDispatcherServletInitializer 会同时创建 DispatcherServlet 和 ContextLoaderListener
     *
     */

    /**
     * 返回带有 @Configuration 注解的类将会用来配置 ContextLoaderListener 创建的应用上下文中的 bean
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    /**
     * 希望 DispatcherServlet 加载包含 WEB 组件的 bean, 如控制器、试图解析器以及处理器映射，而 ContextLoaderListener 要加载
     * 应用中的其它 bean. 这些 bean 通常是驱动应用后端的中间层和数据层的组件。
     * @return
     * 返回带有 @Configuration 注解的类将会用来定义 DispatcherServlet 应用上下文中的 bean
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    // 配置 multipart 解析器
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(
                new MultipartConfigElement("/tmp/spittr/uploads", 2097152, 4194304, 0));
    }
}

package com.archy.spittr.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Registration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by huang on 2017/1/4.
 */
public class MyServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        // 1. 注册 servlet
//        Registration.Dynamic myServlet = servletContext.addServlet("myServlet". MyServlet.class);
//        // 2. 映射 servlet
//        myServlet.addMapping("/custom/**");
    }
}

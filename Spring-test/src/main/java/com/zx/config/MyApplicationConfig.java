package com.zx.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyApplicationConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                MapperConfig.class, ServiceConfig.class, JdbcController.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                ControllerConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }
}

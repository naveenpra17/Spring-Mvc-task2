package com.stackroute.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//this registers a spring dispatcher servlet and creates a web application context
public class UserInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {//redirects to root configuration
        return new Class[] {UserConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() { //used for mapping incoming requests to controller
        return new String[]{"/"};
    }
}

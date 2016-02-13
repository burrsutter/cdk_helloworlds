package com.redhat.samples.springmvc.infrastructure;

import com.redhat.samples.springmvc.Application;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { Application.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}

package com.xworkz.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInti extends AbstractAnnotationConfigDispatcherServletInitializer {

	public SpringWebInti() {
		System.out.println("Createing the SpringWebInti..");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses..");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses..");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings..");
		return null;
	}

}

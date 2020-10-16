package com.pranoy.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?>[] configClasses = {LoveCalculatorAppConfig.class};
		return configClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String[] urlMappings = {"/"};
		return urlMappings;
	}

}

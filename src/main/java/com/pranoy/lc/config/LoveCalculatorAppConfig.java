package com.pranoy.lc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.pranoy.lc.formatter.PhoneFormatter;

@Configuration
@ComponentScan(basePackages = "com.pranoy.lc.controllers")
@EnableWebMvc
public class LoveCalculatorAppConfig implements WebMvcConfigurer {
	// set up view resolver
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Bean(name = "messageSource")
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");

		return messageSource;
	}

	@Bean("validator")
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
		factoryBean.setValidationMessageSource(messageSource());

		return factoryBean;
	}

	// set up formatter
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new PhoneFormatter());
	}

	@Override
	public org.springframework.validation.Validator getValidator() {
		return validator();
	}
}

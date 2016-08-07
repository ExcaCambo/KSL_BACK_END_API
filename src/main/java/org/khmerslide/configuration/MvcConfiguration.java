package org.khmerslide.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/admin/login");
		registry.addViewController("/API.KSL").setViewName("/admin/login");
/*		registry.addViewController("/LOGIN").setViewName("/admin/login");
		registry.addViewController("/API.KSL/LOGIN").setViewName("/admin/login");*/
		registry.addViewController("/developer").setViewName("/swagger");
		// Errors
		registry.addViewController("/404").setViewName("/error/404");
		registry.addViewController("/access-denied").setViewName("/error/404");
		
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedMethods("GET","POST","DELETE","PUT","OPTIONS","PATCH")
		.allowedOrigins("*");
	}
}

package org.khmerslide.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/admin/index");
		registry.addViewController("/login").setViewName("/admin/login");
		registry.addViewController("/about").setViewName("/about");
		registry.addViewController("/admin").setViewName("/admin");
		registry.addViewController("/user").setViewName("/user/user");
		registry.addViewController("/dba").setViewName("/dba");
		
		registry.addViewController("/swagger").setViewName("/swagger");
		
		// Errors
		registry.addViewController("/401").setViewName("/error/401");
		registry.addViewController("/access-denied").setViewName("/error/403");
		
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedMethods("GET","POST","DELETE","PUT","OPTIONS","PATCH")
		.allowedOrigins("*");
	}
}

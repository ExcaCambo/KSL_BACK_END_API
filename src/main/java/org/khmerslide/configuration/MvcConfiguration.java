package org.khmerslide.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/admin/").setViewName("/admin/index");
		registry.addViewController("/admin/home").setViewName("/admin/index");
		registry.addViewController("/admin/index").setViewName("/admin/index");
		registry.addViewController("/admin/login").setViewName("/admin/login");
		registry.addViewController("/admin/add-doc").setViewName("/admin/add-doc");
		registry.addViewController("/admin/add-user").setViewName("/admin/add-user");
		registry.addViewController("/admin/category").setViewName("/admin/category");
		registry.addViewController("/admin/comment").setViewName("/admin/comment");
		registry.addViewController("/admin/confirm-doc").setViewName("/admin/confirm-doc");
		registry.addViewController("/admin/confirm-pdf").setViewName("/admin/confirm-pdf");
		registry.addViewController("/admin/confirm-slide").setViewName("/admin/confirm-slide");
		registry.addViewController("/confirm-word").setViewName("/admin/confirm-word");
		registry.addViewController("/admin/doc-list").setViewName("/admin/doc-list");
		registry.addViewController("/admin/edit-doc").setViewName("/admin/edit-doc");
		registry.addViewController("/admin/edit-user").setViewName("/admin/edit-user");
		registry.addViewController("/admin/pdf-list").setViewName("/admin/pdf-list");
		registry.addViewController("/admin/profile").setViewName("/admin/profile");
		registry.addViewController("/admin/save-list").setViewName("/admin/save-list");
		registry.addViewController("/admin/slide-list").setViewName("/admin/slide-list");
		registry.addViewController("/admin/user-list").setViewName("/admin/user-list");
		registry.addViewController("/admin/word-list").setViewName("/admin/word-list");
		
		registry.addViewController("/word-list").setViewName("/admin/word-list");
		
		
		registry.addViewController("/admin/login").setViewName("/admin/login");
		registry.addViewController("/api").setViewName("/swagger");
		
		// Errors
/*		registry.addViewController("/404").setViewName("/error/404");*/
		/*registry.addViewController("/access-denied").setViewName("/error/404");*/
		
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedMethods("GET","POST","DELETE","PUT","OPTIONS","PATCH")
		.allowedOrigins("*");
	}
}

/**
 * 
 */
package com.demo.saml;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author pnair5
 *
 */
@Configuration
public class MVCConfig extends WebMvcConfigurerAdapter{

		@Override
		public void addViewControllers(ViewControllerRegistry registry) {
			registry.addViewController("/").setViewName("index");
			registry.addViewController("/hello").setViewName("index");
		}
	}

package com.dss.springboot.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.dss.springboot.interceptors.OneInterceptors;
import com.dss.springboot.interceptors.TwoInterceptors;


/**
 * springboot拦截器的配置中心，即定义的拦截器要在这里进行配置才能起作用
 * @author Administrator
 *
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

	/**
	 * 要重写addInterceptors方法，在这里进行拦截器配置
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		/**
		 * 拦截器按照这里配置的顺序执行
		 */
		//registry.addInterceptor(new OneInterceptors()).addPathPatterns("/*/**");			//表示拦截所有的请求
		//registry.addInterceptor(new OneInterceptors()).addPathPatterns("/one/**");			//表示拦截one下面的所有请求
		
		//registry.addInterceptor(new OneInterceptors()).addPathPatterns("/two/**").addPathPatterns("/one/**");		//表示拦截one和two下面的所有请求
		
		/**
		 * 表示拦截one和two下面的所有请求
		List<String> paths = new ArrayList<String>();
		paths.add("/one/**");
		paths.add("/two/**");
		registry.addInterceptor(new OneInterceptors()).addPathPatterns(paths);
		*/
		
		registry.addInterceptor(new OneInterceptors()).addPathPatterns("/one/**");
		registry.addInterceptor(new TwoInterceptors()).addPathPatterns("/two/**");
		
		super.addInterceptors(registry);
	}

}

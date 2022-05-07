package my.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@SuppressWarnings("deprecation")
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "my.mvc")
@Import(MyWebSecurityConfigAdapder.class)
public class WebConfig extends WebMvcConfigurerAdapter {

	// == constants == 
	public static final String RESOLVER_PREFIX = "/WEB-INF/view/";
	public static final String RESOLVER_SUFFIX = ".jsp";
	
	// == Beans ==
	@Bean
	public ViewResolver viewResolver() {
		UrlBasedViewResolver viewResolver =
				new InternalResourceViewResolver();
		
		viewResolver.setPrefix(RESOLVER_PREFIX);
		viewResolver.setSuffix(RESOLVER_SUFFIX);
		return viewResolver;
	}
	
	
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
}

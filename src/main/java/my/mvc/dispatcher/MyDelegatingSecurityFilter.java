package my.mvc.dispatcher;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import my.mvc.config.WebConfig;

public class MyDelegatingSecurityFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		AnnotationConfigWebApplicationContext context
			= new AnnotationConfigWebApplicationContext();	
		
		Filter delegate = (Filter) context.getBean("springSecurityFilterChain");
		
		delegate.doFilter(request, response, chain);
	}

}

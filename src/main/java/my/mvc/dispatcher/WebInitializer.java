package my.mvc.dispatcher;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.sql.rowset.serial.SerialException;

/*import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;*/
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;
import my.mvc.config.MyWebSecurityConfigAdapder;
import my.mvc.config.WebConfig;

/**
 * This class has the implementation of two ways to initialize the 
 * dispatcher servlet. The first technique extends the abstract class
 * @code{AbstractAnnotationConfigDispatcherServletInitializer}
 * and overrides three methods. The second techniques implements the 
 * interface @code{WebApplicationInitializer} and overrides one method
 * and configures the dispatcher servlet. Both techniques are considered
 * programmatically configuring and registering the dispatcher servlet
 * without the use of web.xml or and xml based configuration file
 * 
 * @author James.Benton
 *
 */

@Slf4j
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
	/*implements WebApplicationInitializer*/ 
 {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {WebConfig.class, MyWebSecurityConfigAdapder.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("On Startup");
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	@Override
	public void onStartup(ServletContext servletContext) 
		throws ServletException {
		super.onStartup(servletContext);
	}

	/*private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		log.info("On Startup");
		
		// create the spring application context
		AnnotationConfigWebApplicationContext context =
				new AnnotationConfigWebApplicationContext();
		
		context.register(WebConfig.class);
		
		// create the dispatcher servlet
		DispatcherServlet dispatcherServlet =
				new DispatcherServlet(context);
		
		// register and configure the dispatcher servlet
		ServletRegistration.Dynamic registration = 
				servletContext.addServlet(DISPATCHER_SERVLET_NAME, dispatcherServlet);
		
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
		
	}*/

}

package my.mvc.dispatcher;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(1)
public class MySecurityWebAppInitializer extends AbstractSecurityWebApplicationInitializer {

	public MySecurityWebAppInitializer() {
		super();
	}

}

package my.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	// http://localhost:8181/test/say-hello
	@GetMapping("say-hello")
	public String hello() {
		return "hello";
	}

	// http://localhost:8181/test/say-welcome
	@GetMapping("say-welcome")
	public String welcome() {
		return "welcome";
	}
	
}

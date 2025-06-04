package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

	// Maps root URL /springmvc/ to about.jsp
	@RequestMapping(value = { "/", "" })
	public String aboutNew() {
		return "welcome"; // This returns the view name "about.jsp"
	}
		
	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}	

}

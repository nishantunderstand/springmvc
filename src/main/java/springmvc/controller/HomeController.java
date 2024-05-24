package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String index(Model model) {
		
		// How to Add Primitive Data Type Or String 
		model.addAttribute("name", "Ashish Naafing3434");
		
		// How to Add ArrayList to model
		List<String> friends = new ArrayList<String>();
		friends.add("Aman");
		friends.add("Ashish");
		friends.add("Nishant Why !!!4080438085080");
		friends.add("Ashish Ranjan");
		friends.add("Aakash Sinha");
		friends.add("Nishant");
		friends.add("Nishant Why !!!");
		model.addAttribute("friendlist", friends);		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("About Java File");
		return "about";

	}
}


package springmvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
Jun 4, 2025,10:03:26 PM
Controller to UI | Backend to Frontned 
Spring 2.5 x Approach
	Model : Spring 2.5x
		ScripletTag : Spring 1x
		Expression Language : Spring 2x
		JSTL : Spring 2x
 		Thymleaf : Spring 3.1
	ModelAndView : Spring 2.5x
 */

@Controller
public class Backend2Frontend_Model {	
	@RequestMapping("/modeljsp1")
	public String modeljsp1(Model model) {
		System.out.println(" === Model JSP 1x ====");
		model.addAttribute("name", "Ashish");
		model.addAttribute("id", 444);
		List<String> friends = new ArrayList<String>();		
		friends.add("Aman");
		friends.add("Ashish");
		friends.add("Ashish Ranjan");
		friends.add("Aakash Sinha");
		friends.add("Nishant");		
		model.addAttribute("friendlist", friends);
		return "model-jsp1x"; 		
	}	
	
	
	@RequestMapping("/modeljsp2")
	public String modeljsp2(Model model) {
		System.out.println(" === Model JSP 2x====");
		model.addAttribute("name", "Ashish");
		model.addAttribute("id", 444);
		List<String> friends = new ArrayList<String>();		
		friends.add("Aman");
		friends.add("Ashish");
		friends.add("Ashish Ranjan");
		friends.add("Aakash Sinha");
		friends.add("Nishant");		
		model.addAttribute("friendlist", friends); 		
		return "model-jsp2x";
	}
	
	
	
	/**
	@GetMapping("/home2025Jav9")
	public String home2025Java9(Model model) {
	    model.addAttribute("name", "Nishant");
	    model.addAttribute("friendlist", List.of("Alice", "Bob", "Charlie"));
	    return "home"; // home.html
	}
	*/
	
	// Thymleaf Feature - That's why unable to Test it
	@GetMapping("/home2025")
    public String home2025(Model model) {
        List<String> friends = Arrays.asList("Alice", "Bob", "Charlie");
        model.addAttribute("name", "Nishant");
        model.addAttribute("friendlist", friends);
        return "home"; // home.html or home.jsp
    }

}

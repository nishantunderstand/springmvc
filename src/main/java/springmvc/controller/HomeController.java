package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Backend  --> Frontend 
 * Model
 * ModelAndView
 * 
 * Controller  --> View
 * Why we need ModelAndView ? 
 * How this is better than Model ?
 * 
 * We can use Model as well as ModelAndView
 * Data 
 * Primitive Data Type
 * Object (Student,Person, Employee Few Example)
 * Collection (List, Set, Map)
	
 */
@Controller
public class HomeController {

	@RequestMapping("/home")
	public String index(Model model) {
		
		// How to Add Primitive Data Type Or String 
		model.addAttribute("name", "Ashish");
		
		// How to Add ArrayList to model
		List<String> friends = new ArrayList<String>();
		friends.add("Aman");
		friends.add("Ashish");
		friends.add("Ashish Ranjan");
		friends.add("Aakash Sinha");
		model.addAttribute("friendlist", friends);		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("About Java File");
		return "about";

	}
	
	// Help Without Model And View
	/**
	@RequestMapping("/help")
	public String help() {
		System.out.println("This is Help!!!");
		return "help";
	}
	*/
	
	/**
	 * In Model , We pass model as parameter
	 * But In ModelAndView , We change the return type to ModelAndView methodName
	 * You need to set the view explicity
	 * @return
	 */
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("Here Expression Language is Working");
		System.out.println("Help Controller");

		// Creating Model and view Object
		ModelAndView modelAndView = new ModelAndView();

		// Adding Value to Model & View
		modelAndView.addObject("name","Aakash!!!!!!");
		modelAndView.addObject("rollnumber", 512112);
		
		LocalDateTime nowDateTime= LocalDateTime.now();
		modelAndView.addObject("time",nowDateTime);
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(22);
		list.add(33);
		list.add(99);
		
		modelAndView.addObject("marks",list);
		
		// Setting the view Name
		modelAndView.setViewName("help");
		
		return modelAndView;
		
	}
}


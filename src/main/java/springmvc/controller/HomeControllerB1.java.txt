package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController1 {

	@RequestMapping("/index")
	public String index(Model model) {

		model.addAttribute("name", "Ashish");
		model.addAttribute("id", 444);

		List<String> friends = new ArrayList<String>();
		friends.add("Aman");
		friends.add("Ashish");
		friends.add("Ashish Ranjan");
		friends.add("Aakash Sinha");
		friends.add("Nishant");

		model.addAttribute("friendlist", friends);

		System.out.println("Index Java File");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("About Java File");
		return "about";
	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Java File ");
		return "home";
	}

	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("Here Expression Language is Working");
		System.out.println("Help Controller");

		// Creating Model and view Object
		ModelAndView modelAndView = new ModelAndView();

		// Adding Value to Model & View
		modelAndView.addObject("name","Aakash Sinha Raj");
		modelAndView.addObject("rollnumber", 5);
		
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
	
	@RequestMapping("/help2")
	public ModelAndView help2() {
		System.out.println("Here Expression Language is Not Working");
		System.out.println("Help Controller");

		// Creating Model and view Object
		ModelAndView modelAndView = new ModelAndView();

		// Adding Value to Model & View
		modelAndView.addObject("name", "Aakash Sinha Raj");
		modelAndView.addObject("rollnumber", 5);

		LocalDateTime nowDateTime = LocalDateTime.now();
		modelAndView.addObject("time", nowDateTime);

		// Setting the view Name
		modelAndView.setViewName("help2");

		return modelAndView;

	}

}
// When You Run the Server, You Will not get any Output
// When you Enter localhost:8080/springmvc -> No Output  
// <-- This is Home (Here No Result is Available)
// localhost:8080/springmvc/home -> Yes
// localhost:8080/springmvc/about -> Yes
// localhost:8080/springmvc/index -> Yes

/*
 * <%-- comment
 * 
 * <h1> Name is :<%=name%></h1> <h1> Id is :<%=id%></h1> <h1> Friends are
 * :<%=friends%></h1>
 * 
 * --%>
 */

package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
Jun 4, 2025,10:03:26 PM
Controller to UI | Backend to Frontned 
Spring 2.5 x Approach
	Model
		ScripletTag : Spring 1x
		Expression Language : : Spring 2x
		JSTL : : Spring 2x
 		Thymleaf : : Spring 3.1
	ModelAndView : Spring 2.5x
 */

@Controller
public class Backend2Frontend_ModelAndView {
	@RequestMapping("/modelandviewjsp")
	public ModelAndView modelandviewjsp()
	{
		System.out.println("=== Model And View Controller Working ====");

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
		modelAndView.setViewName("modelandviewjsp-1x");
		
		return modelAndView;
		
	}
	

}

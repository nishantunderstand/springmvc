package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@Controller
public class ContactController
{
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	
	
	@RequestMapping("/contact")
	public String showForm(Model model)
	{
		/**
		model.addAttribute("Header","Learn Code with Durgesh-Nishant");
		model.addAttribute("Desc","Home For Programmer-SpringMVC");
		// Thanks to SpringMVC @ModelAttribute, We moved the code to CommonMethod
		*/
		return "contact";
	}
	
	
	
	/**
	UseCase  Relative and Absolute  
	@RequestMapping(path = "/processform",method = RequestMethod.POST) WRONG
	@RequestMapping(path = "processform",method = RequestMethod.POST) RIGHT
	Why , We need to Enter Relative Path Not Absolute Path
	*/
	
	
	/**
	// Approach 1 , @RequestParam
	// This is a Handler
		@RequestMapping(path = "processform",method = RequestMethod.POST)
		// Fetching Data From Frontend 
		public String handleForm
			(
				@RequestParam("email")String userEmail,
				@RequestParam("userName") String userName,
				@RequestParam("password") String userPassword,
				Model model
			)
		{
			//Priniting in Console
			System.out.println("UserEmail :"+userEmail);
			System.out.println("UserName : "+userName);
			System.out.println("UserPassword : "+userPassword);
			
			// Process Data
			
			// Sending to Frontend
			model.addAttribute("email1",userEmail);
			model.addAttribute("userName1",userName);
			model.addAttribute("password1", userPassword);
			return "success";
		}
		*/
		
		/**Approach 2  
		@ModelAttribute 
			1. Inside Method  
			2. At Method Level
		*/
		@RequestMapping(path = "processform",method = RequestMethod.POST)
		public String handleForm(@ModelAttribute User user,Model model)
		{
			return "success";
		}
		
		/**
		 * UseCase
		@RequestMapping("/contact")
		public String showForm(Model m)
			{
				m.addAttribute("Header","Learn Code with Durgesh-Nishant");
				m.addAttribute("Desc","Home For Programmer-SpringMVC");
				return "contact";
			}
			
		I need to set Header and Desc Everything
		We can combine them as one
		 */
		
		
		@ModelAttribute
		public void commonDataForModel(Model model) {
			model.addAttribute("Header","Learn Code with Durgesh-Nishant Thanks to @ModelAttribute");
			model.addAttribute("Desc","Home For Programmer-SpringMVC");
		}
		
}







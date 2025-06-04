package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController1 {

	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	// This is a Handler
	@RequestMapping(path = "processform",method = RequestMethod.POST)
	public String handleForm
		(
			@RequestParam(name = "email",required = true)String userEmail,
			@RequestParam("name") String userName,
			@RequestParam("password") String userPassword,
			Model model
		)
	{
		System.out.println("UserEmail"+userEmail);
		System.out.println("UserName"+userName);
		System.out.println("UserPassword"+userPassword);
		
		// Process Data
		model.addAttribute("email",userEmail);
		model.addAttribute("name",userName);
		model.addAttribute("password", userPassword);
		return "success";
	}
}


/*
Old Method to Handle Request
@RequestMapping(path = "processform",method = RequestMethod.POST)
public String handleForm(HttpServletRequest request)
	{
		String email = request.getParameter("email");
		System.out.println("UserEmail : "+email);
		return "";
	}

@RequestMapping(path = "/processform",method = RequestMethod.POST) WRONG
@RequestMapping(path = "processform",method = RequestMethod.POST) RIGHT
Why 
We need to Enter Relative Path Not Absolute Path

*/
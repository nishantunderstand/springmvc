package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.NewUser;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		System.out.println("Adding Common Data - Model Attribute");
		m.addAttribute("Header","Learn Code with Durgesh");
		m.addAttribute("Desc","Home For Programmer");
		
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		System.out.println("Creating Form");
		return "contact";
	}
	
	// This is a Handler
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute NewUser newUser,Model model)
	{
		System.out.println("Handler is Working");
		return "success";
	}
}


/*
Method to Handle Request
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
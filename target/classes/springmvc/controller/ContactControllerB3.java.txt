package springmvc.controller;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException.Forbidden;

import springmvc.model.NewUser;

@Controller
public class ContactController3 {

	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		m.addAttribute("Header","Learn Code with Durgesh");
		m.addAttribute("Desc","Home For Programmer");
		return "contact";
	}
	
	// This is a Handler
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute NewUser newUser,Model model)
	{
		model.addAttribute("Header","Learn Code with Durgesh"); 
		model.addAttribute("Desc","Home For Programmer");
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
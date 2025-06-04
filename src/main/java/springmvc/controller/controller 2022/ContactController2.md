package springmvc.controller;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.NewUser;

@Controller
public class ContactController2 {

	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	// This is a Handler
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(
			@RequestParam(name = "email",required = true)String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("password") String userPassword,
			Model model){
		
		
		NewUser user = new NewUser();
	
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		System.out.println(user);
		
		
		
		
		// Process Data
		/*
		 * model.addAttribute("email",userEmail);
			model.addAttribute("name",userName);
		 * model.addAttribute("password", userPassword);
		 */
		
		model.addAttribute("user",user);
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
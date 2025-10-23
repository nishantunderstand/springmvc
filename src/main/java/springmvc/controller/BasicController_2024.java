package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v1") 
// Best Pratice to Add Versioning
public class BasicController_2024 {

  // Maps root URL /springmvc/ to about.jsp
  @RequestMapping(value = {"/", ""}) // This is Handling Root, And Empty
  public String aboutNew() {
    System.out.println("=============Testing123===========");
    return "welcome"; // This returns the view name "about.jsp"
  }

  @RequestMapping("/about")
  public String about() {
    return "about";
  }

  @RequestMapping(value = "/about1",method = RequestMethod.GET)
  public String about1() {
    return "about";
  }
  
  @RequestMapping("/home")
  public String home() {
    return "home";
  }

}


// @RequestMapping : Class Level , Method Level
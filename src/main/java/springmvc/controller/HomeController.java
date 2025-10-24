package springmvc.controller;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/v2")
public class HomeController {

  
/**

  @RequestMapping("/")
  public String welcome() {
     System.out.println("=== TESTING ==== v2====");
     return "Hello Welcome to v2"; // Treated as View name, You need to mention that it is a Response Body. 
  }


| Annotation        | Meaning                            | Return Value Interpreted As      |
| ----------------- | ---------------------------------- | -------------------------------- |
| `@Controller`     | Used for MVC apps (JSP, Thymeleaf) | View name (resolved to JSP/HTML) |
| `@RestController` | Used for REST APIs                 | Response body (text/JSON/XML)    |

   */
  
  
  // If You dont mention RequestMapping, Then Nothing will be Invoked.
  @ResponseBody
  @RequestMapping("/")
  @ResponseStatus(HttpStatus.CREATED)
  public String welcome2() {
    return "Hello Welcome to v2";
  }
  
  @ResponseBody
  @GetMapping("/hello")
  @ResponseStatus(HttpStatus.OK)
  public String hello() {
    return "Hello World";
  }
  
  
  @ResponseBody
  @GetMapping("/number")
  public String number() {
    return "44";
  }
  
  @ResponseBody
  @GetMapping(value = "/number1")
  public int number1() {
    return 44;
  }
  
  // If you want to return number, Then you need to change Spring will return Content-Type: text/plain.
  
  @GetMapping("/number2")
  @ResponseBody
  public Map<String,Integer> numberMap(){
    return Map.of("number",33);
  }
  
}

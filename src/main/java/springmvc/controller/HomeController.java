package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
  
  @ResponseBody
  public String welcome() {
    return "Hello Welcome to v2";
  }
  
  
}

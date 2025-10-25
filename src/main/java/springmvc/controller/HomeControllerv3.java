package springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springmvc.model.NumberResponse;

@RestController
@RequestMapping("/v3")
public class HomeControllerv3 {

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }

  @GetMapping(value = "/number4", produces = "application/json")
  public NumberResponse number4() {
    System.out.println("Hitting /v3/number4");
    NumberResponse response = new NumberResponse(4);
    System.out.println("Returning: " + response.getNumber());
    return response;
  }

  @GetMapping(value = "/number7", produces = "application/json")
  public NumberResponse number7() {
    System.out.println("Hitting /v3/number7");
    NumberResponse response = new NumberResponse(7);
    System.out.println("Returning: " + response.getNumber());
    return response;
  }
}
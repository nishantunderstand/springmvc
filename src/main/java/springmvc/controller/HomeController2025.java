package springmvc.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class HomeController2025 {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

  @GetMapping(value = "/number4", produces = "application/json")
  public Map<String, Integer> number4() {
    System.out.println("Hitting /number4");
    return Map.of("number", 4);
  }

}

package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Jun 5, 2025,12:25:02 AM
 */
@Controller
public class Backend2Frontend_ModelAndView {

    @RequestMapping("/modelandviewjsp")
    public ModelAndView modelandviewjsp() {
        System.out.println("=== Model And View Controller Working ===");

        // Create ModelAndView object
        ModelAndView modelAndView = new ModelAndView();

        // Add basic attributes to the model
        modelAndView.addObject("name", "Aakash Sinha Raj");
        modelAndView.addObject("rollnumber", 5);

        LocalDateTime nowDateTime = LocalDateTime.now();
        modelAndView.addObject("time", nowDateTime);

        // ========= Different Ways to Create List of Marks =========

        // 1. Classic ArrayList (Mutable, Compatible with Java < 8)
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(33);
        list1.add(99);
        modelAndView.addObject("marks1", list1);

        /**
        // 2. Immutable List - Java 9+ (List.of)
        List<Integer> list2 = List.of(11, 21, 31, 41);
        modelAndView.addObject("marks2", list2);
		*/
		
        // 3. Using Arrays.asList (Fixed-size list backed by array)
        List<Integer> list3 = Arrays.asList(100, 200, 300);
        modelAndView.addObject("marks3", list3);

        // 4. Unmodifiable List using Collections (Java < 9)
        List<Integer> tempList = new ArrayList<>();
        tempList.add(1);
        tempList.add(2);
        List<Integer> list4 = Collections.unmodifiableList(tempList);
        modelAndView.addObject("marks4", list4);

        /**
        // 5. Using Streams (Java 8+)
        List<Integer> list5 = Arrays.stream(new int[]{7, 8, 9})
                                    .boxed()
                                    .toList();  // Java 16+, for Java 8 use collect(Collectors.toList())
        modelAndView.addObject("marks5", list5);
		*/
        
        // ===========================================================

        // Set the view name (JSP page to render)
        modelAndView.setViewName("modelandviewjsp-1x"); // This should map to WEB-INF/views/modelandviewjsp-1x.jsp

        return modelAndView;
    }
}

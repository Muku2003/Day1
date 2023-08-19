package com.day.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Exercise2{
	@GetMapping("/name")
    public String getName() {
        String studentName = "Mukudhan"; // You can replace this with actual student name retrieval logic
        return "Welcome " + studentName + "!";
    }
}


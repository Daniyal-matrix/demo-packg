package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HellloController {

    @GetMapping("Greetings")
    public ResponseEntity<String> helloWorld()
    {
        return ResponseEntity.ok("Kesy hain Muneeb bhai!");
    }
}

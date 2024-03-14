package com.kalunga.sbsocialloginlearning.model;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


// lists all products in our database
@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public List<String> getAllProducts(){
        return Arrays.asList("Samsung", "IPhone", "Motorola", "Various");
    }

// Gives access to authorized users
    @GetMapping("/update")
    public String update(){
        return "Only logged-in users can access this end-point";
    }

}

package com.example.restAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @GetMapping
    public ResponseEntity getCompanies() {
        try {
            return ResponseEntity.ok("Server run.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error!!");
        }
    }
}

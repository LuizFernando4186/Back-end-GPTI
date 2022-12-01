package com.br.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class StatusController {
    
    
    String a = "online";

    @GetMapping(path = "/status")
    public String status() { return a; }
}

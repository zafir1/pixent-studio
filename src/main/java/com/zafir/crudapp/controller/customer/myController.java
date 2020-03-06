package com.zafir.crudapp.controller.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class myController {

    @GetMapping("/")
    public String Home(){
        return "ApiConsumer";
    }
}

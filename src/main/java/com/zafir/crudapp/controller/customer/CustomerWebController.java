package com.zafir.crudapp.controller.customer;

import com.zafir.crudapp.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class CustomerWebController {

    @Autowired
    private CustomersRepository customersRepository;

    @GetMapping("/customers")
    public String getAllCustomers(Model model){
        model.addAttribute("customers",customersRepository.findAll());
        return "customers";
    }


}
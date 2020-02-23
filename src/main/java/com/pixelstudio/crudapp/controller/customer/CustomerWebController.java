package com.pixelstudio.crudapp.controller.customer;

import com.pixelstudio.crudapp.model.Customers;
import com.pixelstudio.crudapp.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
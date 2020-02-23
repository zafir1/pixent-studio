package com.pixelstudio.crudapp.controller.customer;

import com.pixelstudio.crudapp.model.Customers;
import com.pixelstudio.crudapp.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomersRepository customersRepository;

    @GetMapping("/customers")
    public List<Customers> getAllCustomers(){
        return customersRepository.findAll();
    }



}

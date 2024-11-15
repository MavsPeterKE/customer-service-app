package com.peter.app.rest.controller;


import com.peter.app.rest.model.Customer;
import com.peter.app.rest.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.TreeMap;

@RequestMapping("/customers/v1")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/register")
    public Customer registerCustomer(@RequestBody Customer customer) {
         return customerService.createCustomer(customer);
    }

    @GetMapping("/get")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/profile/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable Long id ) {
        Optional<Customer> customer = customerService.getCustomerById(id);

        if (customer.isEmpty()){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(customer);
        }
    }
}


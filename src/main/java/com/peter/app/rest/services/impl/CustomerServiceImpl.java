package com.peter.app.rest.services.impl;

import com.peter.app.rest.model.Customer;
import com.peter.app.rest.repository.CustomerRepository;
import com.peter.app.rest.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return this.customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return this.customerRepository.findById(id);
    }
}

package com.example.springbootdocker.controller;

import com.example.springbootdocker.Repository.CustomerRepository;
import com.example.springbootdocker.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository repository;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(repository.save(customer));
    }

    @GetMapping("")
    public ResponseEntity<List<Customer>> getCustomerByName(@RequestParam String name){
        return ResponseEntity.ok(repository.findByFirstName(name));
    }

}

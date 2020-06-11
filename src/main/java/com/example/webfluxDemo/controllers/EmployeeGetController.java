/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.webfluxDemo.controllers;




import com.example.webfluxDemo.repositories.EmployeeRepository;
import model.entities.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author user
 */
@RestController
public class EmployeeGetController {
    @Autowired
   private EmployeeRepository employeeRepo;
    /**Flux  and Mono are the two main concepts involved in reactive programming. 
     * Both are implementations of Publisher  interface, 
     * but Flux  produces 0 to N items, while Mono produces 0 to 1 item.**/
    
    //single value
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public ResponseEntity<Mono<Employees>> findById(@PathVariable("id") Integer id) {
        Mono<Employees> e = employeeRepo.findById(id);
        return new ResponseEntity<Mono<Employees>>(e, HttpStatus.OK );
    }
  
    //list of values
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Flux<Employees> findAll() {
        Flux<Employees> emps = employeeRepo.findAll();
        return emps;
    }
    //Real-time event streaming using Spring Webflux
    
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.webfluxDemo.controllers;




import com.example.webfluxDemo.repositories.EmployeeRepository;
import model.entities.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 *
 * @author user
 */
@RestController
public class EmployeePostController {
    @Autowired
   private EmployeeRepository employeeRepo;
    
    //save single value
    @RequestMapping(value = { "/create"}, method = RequestMethod.POST)   
    public  Mono<Employees> create(@RequestBody Employees e) {        
        return employeeRepo.save(e);        
    }
    
    //save List of value(collections)
//    @RequestMapping(value = { "/createAll"}, method = RequestMethod.POST)   
//    public void createAll(@RequestBody List<Employees> nList) {
//        employeeRepo.saveAll(nList);
//    }
//    

}

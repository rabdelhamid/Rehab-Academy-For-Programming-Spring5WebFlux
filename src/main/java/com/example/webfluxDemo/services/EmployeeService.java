/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.webfluxDemo.services;

import com.example.webfluxDemo.repositories.EmployeeRepository;
import model.entities.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author user
 */
@Service
public class EmployeeService {
     @Autowired
    private EmployeeRepository employeeRepo;
    public void create(Employees e) {
        employeeRepo.save(e).subscribe();
    }
 
    public Mono<Employees> findById(Integer id) {
        return employeeRepo.findById(id);
    }
 
    public Flux<Employees> findByName(String name) {
        return employeeRepo.findByName(name);
    }
 
    public Flux<Employees> findAll() {
        return employeeRepo.findAll();
    }
 
    public Mono<Employees> update(Employees e) {
        return employeeRepo.save(e);
    }
 
    public Mono<Void> delete(Integer id) {
        return employeeRepo.deleteById(id);
    }
 
}

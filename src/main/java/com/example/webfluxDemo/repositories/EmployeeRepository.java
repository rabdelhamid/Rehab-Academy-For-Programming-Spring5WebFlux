/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.webfluxDemo.repositories;



import java.time.Duration;
import model.entities.Employees;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 *
 * @author user
 */
//https://www.callicoder.com/java-8-completablefuture-tutorial/
//https://www.baeldung.com/spring-data-mongodb-tailable-cursors
@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employees, Integer>{
    public Flux<Employees> findByName(String name);
    

   
  
  
    
}

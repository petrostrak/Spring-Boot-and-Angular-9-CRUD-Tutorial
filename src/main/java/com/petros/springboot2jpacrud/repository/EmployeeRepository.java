/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petros.springboot2jpacrud.repository;

import com.petros.springboot2jpacrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author petros
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}

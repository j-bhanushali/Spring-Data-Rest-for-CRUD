/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.REST.SpringDataREst.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jay
 */
@RepositoryRestResource(collectionResourceRel="students",path="students")
public interface StudentRepo extends JpaRepository<Student,Integer> 
{
    
}

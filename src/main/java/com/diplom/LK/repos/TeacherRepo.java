/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplom.LK.repos;

import com.diplom.LK.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alex1
 */
public interface TeacherRepo extends CrudRepository<Teacher, Long>{
    
    
}

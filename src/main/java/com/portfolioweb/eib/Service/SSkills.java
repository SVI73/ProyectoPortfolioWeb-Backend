/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.eib.Service;

import com.portfolioweb.eib.Entity.skills;
import com.portfolioweb.eib.Repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SSkills {
    @Autowired
    RSkills rSkills;
    
    public List<skills> list() {
        return rSkills.findAll();
    }
    
    public Optional<skills> getOne(int id) {
        return rSkills.findById(id);
    }
    
    public Optional<skills> getByNombre(String nombre) {
        return rSkills.findByNombre(nombre);
    }
    
    public void save(skills skill) {
        rSkills.save(skill);
    }
    
    public void delete(int id) {
        rSkills.deleteById(id);
    }
    
    public boolean existsById(int id) {
        return rSkills.existsById(id);
    }
    
    public boolean existsByNombre(String nombre) {
        return rSkills.existsByNombre(nombre);
    }
}

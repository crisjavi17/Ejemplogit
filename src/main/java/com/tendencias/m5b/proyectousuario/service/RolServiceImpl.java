/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.m5b.proyectousuario.service;

import com.tendencias.m5b.proyectousuario.model.Rol;
import com.tendencias.m5b.proyectousuario.repository.RolRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */

@Service
public class RolServiceImpl extends GenericServiceImpl<Rol, Integer> implements GenericService<Rol, Integer>{
    
    
    @Autowired
    RolRepository rolRepository;
    @Override
    public CrudRepository<Rol, Integer> getDao(){
        
        return rolRepository;
    }
      
}

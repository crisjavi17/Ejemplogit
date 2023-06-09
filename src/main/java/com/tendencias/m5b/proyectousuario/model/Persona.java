/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.m5b.proyectousuario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author LENOVO
 */

@Data
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int id_persona;

    @Size(min = 3, max = 10, message = "El usuario debe tener entre 3 y 10 caracteres")
    @NotBlank(message = "El rol no puede estar en blanco")
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "correo")
    private String correo;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;

    @Column(name = "instruccion")
    private String instruccion;

}

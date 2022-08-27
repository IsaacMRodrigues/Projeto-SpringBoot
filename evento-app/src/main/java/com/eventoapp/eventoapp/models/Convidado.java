/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eventoapp.eventoapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@Entity
public class Convidado {
    
    @Id
    @NotEmpty
    private String rg;
    @NotEmpty
    private String nomeConvidado;
    
    @ManyToOne
    private Evento evento;
    
    
}

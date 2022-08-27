/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.eventoapp.eventoapp.EventoRepository;

import com.eventoapp.eventoapp.models.Convidado;
import com.eventoapp.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author isaac
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
    
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);
    
}

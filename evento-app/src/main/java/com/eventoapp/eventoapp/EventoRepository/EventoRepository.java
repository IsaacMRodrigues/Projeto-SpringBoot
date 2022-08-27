
package com.eventoapp.eventoapp.EventoRepository;


import com.eventoapp.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author isaac
 */
public interface EventoRepository extends CrudRepository<Evento, String> {
    
    Evento findByCodigo(long codigo);
    
}

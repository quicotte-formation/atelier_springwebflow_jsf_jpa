/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Genre;

/**
 *
 * @author IB
 */
public interface GenreServiceCRUD extends CrudRepository<Genre, Long>{
    
    @Query(value = "SELECT g FROM Genre g ORDER BY g.nom")
    public List<Genre> listerTousParOrdreAlpha();
    
    public List<Genre> findAllByOrderByNom();
}

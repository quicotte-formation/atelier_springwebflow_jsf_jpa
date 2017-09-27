/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.entity.Genre;
import streaming.service.GenreServiceCRUD;

/**
 *
 * @author IB
 */
@Controller
public class GenreController {
    
    @Autowired
    private GenreServiceCRUD service;
    
    @RequestMapping(value = "/genre_lister", method = RequestMethod.GET)
    public String lister(Model m){
        
        Iterable genres = service.findAll();// Récup genres à partir DB
        
        m.addAttribute( "listeGenres", genres );// Définit attrib pour JSP
        
        return "genre_lister.jsp";
    }
    
//    @RequestMapping(value = "/f1", method = RequestMethod.GET)
//    private String f1(){
//        
//        service.save(new Genre());
//        
//        return "pageinconnue.jsp";
//    }
}

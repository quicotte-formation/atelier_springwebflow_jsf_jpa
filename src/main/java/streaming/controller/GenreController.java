/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @RequestMapping(value = "/genre_modifier/{id}", method = RequestMethod.POST)
    public String modifierPOST(@ModelAttribute("genreAModifier") Genre monGenre){
        
        service.save(monGenre);
        
        return "redirect:/genre_lister";
    }
    
    @RequestMapping(value = "/genre_modifier/{genreId}", method = RequestMethod.GET)
    public String modifierGET( @PathVariable("genreId") long id, Model m){
        
        // Récup genre à partir de la base
        Genre g = service.findOne(id);
        
        // Ajoute ce genre comme DTO
        m.addAttribute("genreAModifier", g);
        
        // Renvoie à ma vue
        return "genre_modifier.jsp";
    }
    
    @RequestMapping(value = "/genre_supprimer/{idGenre}", method = RequestMethod.GET)
    public String supprimer(@PathVariable("idGenre") long id){
        
        service.delete(id);
        
        return "redirect:/genre_lister";
    }
    
    @RequestMapping(value = "/genre_ajouter", method = RequestMethod.POST)
    public String ajouterPOST( @ModelAttribute("genre") @Valid Genre g, BindingResult result ){
        
        if( result.hasErrors() ){
            
            return "genre_ajouter.jsp";
        }
        
        service.save(g);
        
        return "redirect:/genre_lister";
    }
    
    @RequestMapping(value = "/genre_ajouter", method = RequestMethod.GET)
    public String ajouterGET(Model m){
        Genre g = new Genre();
        m.addAttribute("genre", g);
        
        return "genre_ajouter.jsp";
    }
    
    @RequestMapping(value = {"/genre_lister", "/"}, method = RequestMethod.GET)
    public String lister(Model m){
        
        Iterable genres = service.findAllByOrderByNom();// Récup genres à partir DB
        
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

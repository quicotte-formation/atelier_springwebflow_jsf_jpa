/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.entity.Film;
import streaming.service.FilmServiceCRUD;
import streaming.service.GenreServiceCRUD;

/**
 *
 * @author tom
 */
@Controller
public class FilmController {
    
    @Autowired
    private FilmServiceCRUD service;
    
    @Autowired
    private GenreServiceCRUD genreService;
    
    @RequestMapping(value = "/film_ajouter", method = RequestMethod.POST)
    public String ajouterPOST(@ModelAttribute("film") Film f){
        
        service.save(f);
        
        return "redirect:/films_lister.jsp";
    }
    
    @RequestMapping(value = "/film_ajouter", method = RequestMethod.GET)
    public String ajouterGET(Model m){
        
        m.addAttribute("film", new Film());
        m.addAttribute("genres", genreService.findAllByOrderByNom());
        
        return "film_ajouter.jsp";
    }
}

package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entite.Universite;
import tn.esprit.spring.serviceInterface.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Universite")
public class UniversiteController {

    @GetMapping("/retrieveAllUniversite")
    public List<Universite> retrieveAllUniversite() {
        return IUniversiteService.retrieveAllUniversite();
    }

    @PostMapping("/addUniversite")
    public Universite addUniversite(Universite c) {
        return IUniversiteService.addUniversite(c);
    }

    @PutMapping("/updateUniversite")
    public Universite updateUniversite(Universite c) {
        return IUniversiteService.updateUniversite(c);
    }

    @GetMapping("/retrieveUniversite/{idUniversite}")
    public Universite retrieveUniversite(@PathVariable long idUniversite) {
        return IUniversiteService.retrieveUniversite(idUniversite);
    }

    @DeleteMapping("/removeUniversite/{idUniversite}")
    public void removeUniversite(@PathVariable long idUniversite) {
        IUniversiteService.removeUniversite(idUniversite);
    }

    IUniversiteService IUniversiteService;

}

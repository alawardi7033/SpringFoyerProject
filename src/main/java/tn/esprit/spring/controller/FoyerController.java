package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.entite.Foyer;
import tn.esprit.spring.serviceInterface.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Foyer")
public class FoyerController {
    IFoyerService iFoyerService;


    @GetMapping("/retrieveAllFoyers")
    public List<Foyer> retrieveAllFoyers() {
        return iFoyerService.retrieveAllFoyers();
    }

    @PostMapping("/addFoyer")
    public Foyer addFoyer(Foyer f) {
        return iFoyerService.addFoyer(f);
    }

    public Foyer updateFoyer(Foyer f) {
        return iFoyerService.updateFoyer(f);
    }

    public Foyer retrieveFoyer(long idFoyer) {
        return iFoyerService.retrieveFoyer(idFoyer);
    }

    public void removeFoyer(long idFoyer) {
        iFoyerService.removeFoyer(idFoyer);
    }





}

package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entite.Bloc;
import tn.esprit.spring.serviceInterface.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Bloc")
public class BlocController {
    IBlocService IBlocService;
    @GetMapping("/retrieveAllBloc")
    public List<Bloc> retrieveAllBloc() {
        return IBlocService.retrieveAllBloc();
    }

    @PostMapping("/addBloc")
    public Bloc addFoyer(Bloc b) {
        return IBlocService.addFoyer(b);
    }

    @PutMapping("/updateBloc")
    public Bloc updateFoyer(Bloc b) {
        return IBlocService.updateFoyer(b);
    }

    @GetMapping("/retrieveBloc/{idBloc}")
    public Bloc retrieveFoyer(@PathVariable long idBloc) {
        return IBlocService.retrieveFoyer(idBloc);
    }

    @DeleteMapping("/removeBloc/{idBloc}")
    public void removeFoyer(@PathVariable long idBloc) {
        IBlocService.removeFoyer(idBloc);
    }


}

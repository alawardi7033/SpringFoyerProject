package tn.esprit.spring.serviceInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entite.Bloc;
import tn.esprit.spring.entite.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long  idFoyer);

    void removeFoyer (long idFoyer);

}

package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entite.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllFoyers();

    Chambre addFoyer (Chambre c);

    Chambre updateFoyer (Chambre c);

    Chambre retrieveFoyer (long  idChambre);

    void removeFoyer (long idChambre);
}

package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entite.Reservation;
import tn.esprit.spring.entite.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite addUniversite (Universite c);

    Universite updateUniversite (Universite c);

    Universite retrieveUniversite(long  idUniversite);

    void removeUniversite (long idUniversite);
}

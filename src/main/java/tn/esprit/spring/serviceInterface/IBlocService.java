package tn.esprit.spring.serviceInterface;

import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Bloc;


import java.util.List;


public interface IBlocService {
    List<Bloc> retrieveAllBloc();

    Bloc addFoyer (Bloc b);

    Bloc updateFoyer (Bloc b);

    Bloc retrieveFoyer (long  idBloc);

    void removeFoyer (long idBloc);

    List<Bloc>getBlockByNomUniv(String uni);
}

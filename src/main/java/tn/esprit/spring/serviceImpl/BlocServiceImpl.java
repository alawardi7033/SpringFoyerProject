package tn.esprit.spring.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Bloc;
import tn.esprit.spring.repository.blocRepository;
import tn.esprit.spring.serviceInterface.IBlocService;

import java.util.List;
@AllArgsConstructor
@Service
public class BlocServiceImpl implements IBlocService {
    private blocRepository bRepository;
    @Override
    public List<Bloc> retrieveAllBloc() {
        return bRepository.findAll();
    }

    @Override
    public Bloc addFoyer(Bloc b) {
        return bRepository.save(b);
    }

    @Override
    public Bloc updateFoyer(Bloc b) {
        return bRepository.save(b);
    }

    @Override
    public Bloc retrieveFoyer(long idBloc) {
        return bRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeFoyer(long idBloc) {
        bRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getBlockByNomUniv(String uni) {
        return bRepository.findByFoyerUniversiteNomUniversiteLike(uni);
    }


}

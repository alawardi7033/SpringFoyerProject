package tn.esprit.spring.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Foyer;
import tn.esprit.spring.repository.foyerRepository;
import tn.esprit.spring.serviceInterface.IFoyerService;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {
private foyerRepository fRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return fRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return fRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return fRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return fRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        fRepository.deleteById(idFoyer);
    }
}

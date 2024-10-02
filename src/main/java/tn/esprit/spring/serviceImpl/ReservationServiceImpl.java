package tn.esprit.spring.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Reservation;
import tn.esprit.spring.repository.reservationRepository;
import tn.esprit.spring.serviceInterface.IReservationService;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    private reservationRepository rRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return rRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation c) {
        return rRepository.save(c);
    }

    @Override
    public Reservation updateReservation(Reservation c) {
        return rRepository.save(c);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return rRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(String idReservation) {
        rRepository.deleteById(idReservation);
    }
}

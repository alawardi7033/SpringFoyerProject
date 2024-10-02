package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entite.Chambre;


@Repository
public interface chambreRepository extends JpaRepository<Chambre, Long> {
}

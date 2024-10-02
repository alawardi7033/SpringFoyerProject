package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entite.Bloc;

@Repository
public interface blocRepository extends JpaRepository<Bloc, Long> {

}

package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entite.Universite;

import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite , Long> {


}

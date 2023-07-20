package com.garage.studi.repository;

import com.garage.studi.pojo.Horaire;
import com.garage.studi.pojo.state.Jour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HoraireRepository extends JpaRepository<Horaire,Long> {
    Optional<Horaire> findHoraireByJour(Jour jour);
}

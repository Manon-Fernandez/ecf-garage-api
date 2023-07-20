package com.garage.studi.repository;

import com.garage.studi.pojo.Avis;
import com.garage.studi.pojo.state.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvisRepository extends JpaRepository<Avis,Long> {
    List<Avis> findAllAvisByStatus(Status status);

}

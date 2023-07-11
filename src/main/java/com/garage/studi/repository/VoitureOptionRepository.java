package com.garage.studi.repository;

import com.garage.studi.pojo.Option;
import com.garage.studi.pojo.VoitureOption;
import com.garage.studi.pojo.embeddable.VoitureOptionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureOptionRepository extends JpaRepository<VoitureOption, VoitureOptionId> {


    @Query(value = "SELECT * FROM VoitureOption vo WHERE voiture_id = ?1",
    nativeQuery = true)
    List<VoitureOption> findVoitureOptionByVoitureId(Long voitureId);
}

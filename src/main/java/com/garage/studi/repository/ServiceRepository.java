package com.garage.studi.repository;

import com.garage.studi.pojo.ServiceGarage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceGarage,Long> {


}

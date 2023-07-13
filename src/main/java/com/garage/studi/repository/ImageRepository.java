package com.garage.studi.repository;

import com.garage.studi.pojo.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long> {
}

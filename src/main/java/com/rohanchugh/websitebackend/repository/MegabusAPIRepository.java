package com.rohanchugh.websitebackend.repository;

import com.rohanchugh.websitebackend.model.MegabusAPI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MegabusAPIRepository extends JpaRepository<MegabusAPI, Integer> {

}

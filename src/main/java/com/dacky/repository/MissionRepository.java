package com.dacky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dacky.model.Mission;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {

}

package com.dacky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dacky.model.UserMission;

@Repository
public interface UserMissionRepository extends JpaRepository<UserMission, Long> {

}

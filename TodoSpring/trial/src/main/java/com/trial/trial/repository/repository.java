package com.trial.trial.repository;

import com.trial.trial.entity.entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<entity, Integer> {
}

package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {

}
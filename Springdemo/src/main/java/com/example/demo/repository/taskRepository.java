package com.example.demo.repository;

import com.example.demo.Entity.task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface taskRepository extends JpaRepository<task, Long> {
    List<task> findAll();
    task findByManagerMobile(String managerMobile);
}
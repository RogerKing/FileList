package com.example.demo.dao;

import com.example.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByManagerMobile(String managerMobile);
    Task findById(Long id);

    @Transactional
    void deleteById(Long id);
    List<Task> findAll();
}

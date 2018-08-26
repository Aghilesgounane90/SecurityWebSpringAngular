package com.goldeninformatique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goldeninformatique.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}

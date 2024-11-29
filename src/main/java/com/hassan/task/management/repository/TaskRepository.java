package com.hassan.task.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hassan.task.management.entity.Task;

@Repository
	public interface TaskRepository extends JpaRepository<Task, Long> {
	    @Query("SELECT t FROM Task t JOIN t.tags tag WHERE :tagName MEMBER OF tag.name")
	    List<Task> findByTagName(@Param("tagName") String tagName);

	    List<Task> findByStatus(Boolean status);
	}



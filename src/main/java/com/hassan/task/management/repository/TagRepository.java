package com.hassan.task.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hassan.task.management.DTOs.TagSummary;
import com.hassan.task.management.entity.Tag;

@Repository
	public interface TagRepository extends JpaRepository<Tag, Long> {
	    @Query("SELECT new com.hassan.taskmanagement.dto.TagSummary(t.id, t.name, COUNT(tasks)) " +
	           "FROM Tag t LEFT JOIN t.tasks tasks GROUP BY t.id, t.name")
	    List<TagSummary> findAllWithTaskCounts();
	}



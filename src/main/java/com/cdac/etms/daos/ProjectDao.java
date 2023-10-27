package com.cdac.etms.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.etms.entities.Project;

public interface ProjectDao extends JpaRepository<Project,  Integer>{
	
	List<Project> findByStatus(String status);
	int countByStatus(String status) ;
	
}

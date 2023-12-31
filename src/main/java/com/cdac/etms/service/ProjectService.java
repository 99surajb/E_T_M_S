package com.cdac.etms.service;

import java.util.List;

import com.cdac.etms.entities.Project;

public interface ProjectService {
	Project save(Project pro);
	Project update(Project pro);
	Project findById(int id);
	boolean delete (int id);
	 List<Project> findAll ();
	 List<Project> findByStatus(String status);
	int countByStatus(String status);
	long countall();
}

package com.cdac.etms.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.etms.entities.Department;

public interface DepartmentDao extends JpaRepository<Department,  Integer>{
	
}

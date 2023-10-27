package com.cdac.etms.service;

import java.util.List;

import com.cdac.etms.entities.Department;

public interface DepartmentService {
		  List<Department> findAll ();
		  Department findById(int id);
}

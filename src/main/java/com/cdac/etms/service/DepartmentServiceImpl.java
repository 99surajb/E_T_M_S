package com.cdac.etms.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.etms.daos.DepartmentDao;
import com.cdac.etms.entities.Department;

@Transactional
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	public DepartmentDao deptDao;
	
	@Override
	public List<Department> findAll() {
		return deptDao.findAll();
	}

	@Override
	public Department findById(int id) {
		Optional<Department> dept = deptDao.findById(id);
		return dept.orElse(null);
	}

}

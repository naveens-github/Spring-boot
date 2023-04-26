package com.myproject.Springboot.service;

import com.myproject.Springboot.entity.Department;
import com.myproject.Springboot.error.DepartmentNotFound;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFound;

    void deleteRecordById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentsByName(String departmentName);
}

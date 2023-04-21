package com.myproject.Springboot.service;

import com.myproject.Springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);

    void deleteRecordById(Long departmentId);
}

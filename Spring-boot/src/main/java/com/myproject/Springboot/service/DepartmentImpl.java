package com.myproject.Springboot.service;

import com.myproject.Springboot.entity.Department;
import com.myproject.Springboot.error.DepartmentNotFound;
import com.myproject.Springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();

    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFound {
        //return departmentRepository.findById(departmentId).get();  //Without Exception handling
        Optional<Department> department = departmentRepository.findById(departmentId);

        if(!department.isPresent())
            throw new DepartmentNotFound("Department not available");

        return department.get();
    }

    @Override
    public void deleteRecordById(Long departmentId) {
         departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department dpForExistingId = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName()))
            dpForExistingId.setDepartmentName(department.getDepartmentName());
        if(Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress()))
            dpForExistingId.setDepartmentAddress(department.getDepartmentAddress());
        if(Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode()))
            dpForExistingId.setDepartmentCode(department.getDepartmentCode());

        return departmentRepository.save(dpForExistingId);
    }

    @Override
    public Department fetchDepartmentsByName(String departmentName) {
        //return departmentRepository.findByDepartmentName(departmentName);
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName); //This will give results if we pass any case letters Eg: CS, cs
    }
}

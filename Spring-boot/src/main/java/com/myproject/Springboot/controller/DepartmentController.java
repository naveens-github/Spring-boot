package com.myproject.Springboot.controller;

import com.myproject.Springboot.entity.Department;
import com.myproject.Springboot.error.DepartmentNotFound;
import com.myproject.Springboot.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside save departmet of departmentController class");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments") //Fetch all the records
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Inside fetch departmet of departmentController class");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}") //Fetch record by ID
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFound {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteRecordById(departmentId);
        return "Record deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentsByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentsByName(departmentName);
    }
}

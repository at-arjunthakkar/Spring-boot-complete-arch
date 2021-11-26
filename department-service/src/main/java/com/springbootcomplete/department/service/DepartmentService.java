package com.springbootcomplete.department.service;

import com.springbootcomplete.department.entity.Department;
import com.springbootcomplete.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("saveDepartment - DepartmentService ");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info("findDepartmentById - DepartmentService ");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}

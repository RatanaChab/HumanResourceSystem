package com.example.demo.EmployeeDetail;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpDetailRepository extends JpaRepository<EmployeeDetails, Long> {
}

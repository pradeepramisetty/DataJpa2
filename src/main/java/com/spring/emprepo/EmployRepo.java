package com.spring.emprepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.adrs.Employee;

public interface EmployRepo extends JpaRepository<Employee, Integer> {

}

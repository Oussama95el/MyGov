package com.simplon.ministry.financeandeconomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplon.ministry.financeandeconomy.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

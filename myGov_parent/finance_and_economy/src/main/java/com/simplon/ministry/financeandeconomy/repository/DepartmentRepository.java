package com.simplon.ministry.financeandeconomy.repository;

import com.simplon.ministry.financeandeconomy.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

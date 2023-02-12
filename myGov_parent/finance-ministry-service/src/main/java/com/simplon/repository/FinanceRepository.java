package com.simplon.repository;


import com.simplon.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FinanceRepository extends JpaRepository<Finance, Long> {
}

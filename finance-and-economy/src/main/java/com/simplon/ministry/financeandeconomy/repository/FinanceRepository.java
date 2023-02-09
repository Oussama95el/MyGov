package com.simplon.ministry.financeandeconomy.repository;

import com.simplon.ministry.financeandeconomy.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceRepository extends JpaRepository<Finance, Long> {
}

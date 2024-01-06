package com.crm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesDataRepository extends JpaRepository<SalesData, Long> {
    // You can add custom query methods if needed
}


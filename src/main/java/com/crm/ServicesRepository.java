package com.crm;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesRepository extends JpaRepository<Services, Long> {
    // You can add custom query methods if needed
}

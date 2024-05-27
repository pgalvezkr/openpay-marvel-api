package com.openpay.marvel.repository;

import com.openpay.marvel.model.ConsumerAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerAuditRepository extends JpaRepository<ConsumerAudit, Long> {
}

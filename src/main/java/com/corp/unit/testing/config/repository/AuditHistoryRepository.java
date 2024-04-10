package com.corp.unit.testing.config.repository;

import com.corp.unit.testing.config.model.AuditHistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditHistoryRepository extends JpaRepository<AuditHistory, Long> {

  List<AuditHistory> findById(@Param("configId") Long configId);
}

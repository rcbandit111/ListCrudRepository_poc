package com.corp.unit.testing.config.repository;

import java.util.List;

import com.corp.unit.testing.config.model.AgreementTermDocsHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AgreementTermHistoryRepository extends JpaRepository<AgreementTermDocsHistory, Long> {

  List<AgreementTermDocsHistory> findByIdAsc(@Param("id") Long id);
}

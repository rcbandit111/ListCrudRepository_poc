package com.corp.unit.testing.config.repository;

import com.corp.unit.testing.config.model.AgreementTermDocsEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface AgreementTermDocsRepository extends JpaRepository<AgreementTermDocsEntity, Long> {

  List<AgreementTermDocsEntity> findById(String region);

}

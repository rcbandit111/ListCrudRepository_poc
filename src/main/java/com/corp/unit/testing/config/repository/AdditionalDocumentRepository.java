package com.corp.unit.testing.config.repository;

import java.util.List;
import java.util.Optional;

import com.corp.unit.testing.config.model.AdditionalDocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface AdditionalDocumentRepository extends JpaRepository<AdditionalDocumentEntity, Long> {

  List<AdditionalDocumentEntity> findByLabelAsc(String id);

  Optional<AdditionalDocumentEntity> findById(String id);
}

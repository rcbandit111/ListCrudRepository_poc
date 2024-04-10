package com.corp.unit.testing.config.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "term_docs")
@EqualsAndHashCode(callSuper = false)
public class AgreementTermDocsEntity {

  @Id
  @Column(name = "internal_id", nullable = false)
  private Long internalId;

  @Column(name = "region", nullable = false)
  private String region;

  @Column(name = "file_name", nullable = false)
  private String filename;

}

package com.corp.unit.testing.config.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "agreement_term")
@EqualsAndHashCode(callSuper = false)
public class AgreementTermDocsHistory {

  @Id
  @Column(name = "internal_id", updatable = false, nullable = false)
  private Long internalId;

  @Column(name = "config_id")
  private Long configId;

  @Column(name = "version")
  private String version;

}

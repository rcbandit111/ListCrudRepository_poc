package com.corp.unit.testing.config.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "history")
@EqualsAndHashCode(callSuper = false)
public class AuditHistory {

  @Id
  @Column(name = "internal_id", nullable = false)
  private Long internalId;

  @Column(name = "updated_by")
  private String updatedBy;

}

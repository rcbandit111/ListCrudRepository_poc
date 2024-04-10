package com.corp.unit.testing.config.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "additional_docs")
@EqualsAndHashCode(callSuper = false)
public class AdditionalDocumentEntity {

  @Id
  @Column(name = "internal_id", nullable = false)
  private Long internalId;

  @Column(name = "id", nullable = false)
  private String documentId;

  @Column(name = "label", nullable = false)
  private String label;

  @Column(name = "comment", nullable = false)
  private String comment;

}

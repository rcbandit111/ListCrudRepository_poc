# ListCrudRepository_poc

Test project to solve issue for Spring Boot 3 migration:

DocumentRepository.java:14: error: cannot access ListCrudRepository
public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {
                                                      ^
  class file for org.springframework.data.repository.ListCrudRepository not found

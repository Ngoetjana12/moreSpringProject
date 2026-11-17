package org.mecerintered.morespringproject.repository;

import org.mecerintered.morespringproject.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Students, Long> {

    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Long id);
    Optional<Students> findByEmail(String email);
    Students findByLastName(String lastName);
}

package com.jornaldio.jornalapi.repository;

import com.jornaldio.jornalapi.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepository extends JpaRepository<Author, String> {
}

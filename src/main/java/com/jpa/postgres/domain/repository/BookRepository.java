package com.jpa.postgres.domain.repository;

import com.jpa.postgres.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}

package com.jpa.postgres;

import com.jpa.postgres.domain.Book;
import com.jpa.postgres.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPostgresApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;
	public static void main(String[] args) {
		SpringApplication.run(JpaPostgresApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book("Hashcode","Hashcode","Madhukar");
		bookRepository.save(b1);

		bookRepository.findAll().forEach(e-> System.out.println(e));
	}
}

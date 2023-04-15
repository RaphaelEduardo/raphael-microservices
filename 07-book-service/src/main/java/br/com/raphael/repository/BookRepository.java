package br.com.raphael.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raphael.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}

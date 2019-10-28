package mypackage.repositories;

import org.springframework.data.repository.CrudRepository;

import mypackage.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
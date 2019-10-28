package mypackage.repositories;

import org.springframework.data.repository.CrudRepository;

import mypackage.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
package mypackage.repositories;

import org.springframework.data.repository.CrudRepository;

import mypackage.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
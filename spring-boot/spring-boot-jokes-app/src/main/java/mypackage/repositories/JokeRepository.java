package mypackage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mypackage.models.Joke;

@Repository
public interface JokeRepository extends CrudRepository<Joke, Integer> {

}
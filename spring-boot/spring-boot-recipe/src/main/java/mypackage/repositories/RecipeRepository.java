package mypackage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mypackage.models.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {}
package org.pierre.calories.repository;

import org.pierre.calories.model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

// https://www.baeldung.com/spring-data-rest-intro
@RepositoryRestResource(collectionResourceRel = "meal", path = "meal")
@Repository
public interface MealRepository extends CrudRepository<Meal, Long> {

}

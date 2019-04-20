package org.pierre.calories.repository;

import org.pierre.calories.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

// https://www.baeldung.com/spring-data-rest-intro
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

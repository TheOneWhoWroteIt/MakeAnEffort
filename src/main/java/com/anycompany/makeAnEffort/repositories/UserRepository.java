package com.anycompany.makeAnEffort.repositories;

import com.anycompany.makeAnEffort.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("select u from User u where u.login =?1")
    User findByLogin(String login);
}

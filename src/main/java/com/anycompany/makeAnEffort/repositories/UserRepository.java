package com.anycompany.makeAnEffort.repositories;

import com.anycompany.makeAnEffort.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

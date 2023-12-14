package com.dineshi.DemoApp.repository;

import com.dineshi.DemoApp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}

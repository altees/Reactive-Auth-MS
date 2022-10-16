package com.altees.auth.repositories;

import com.altees.auth.vo.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.Optional;

public interface UserRepository extends ReactiveCrudRepository<User,String> {
    Optional<User> findByUserName(String userName);
}

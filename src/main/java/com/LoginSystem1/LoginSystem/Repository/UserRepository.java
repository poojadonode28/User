package com.LoginSystem1.LoginSystem.Repository;

import com.LoginSystem1.LoginSystem.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findUserByToken(String token);
}

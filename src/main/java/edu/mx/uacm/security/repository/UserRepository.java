package edu.mx.uacm.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mx.uacm.security.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

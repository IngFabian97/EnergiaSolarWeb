package com.energiasolar.solarapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.energiasolar.solarapp.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

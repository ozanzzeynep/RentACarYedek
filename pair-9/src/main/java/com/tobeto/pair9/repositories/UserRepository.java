package com.tobeto.pair9.repositories;

import com.tobeto.pair9.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

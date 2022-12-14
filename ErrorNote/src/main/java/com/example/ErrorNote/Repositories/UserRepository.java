package com.example.ErrorNote.Repositories;


import com.example.ErrorNote.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
   User findByEmailAndMpd(String email, String mdp);
}

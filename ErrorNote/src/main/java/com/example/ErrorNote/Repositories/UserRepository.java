package com.example.ErrorNote.Repositories;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Model.User;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface UserRepository extends JpaRepository<User, Long> {
}

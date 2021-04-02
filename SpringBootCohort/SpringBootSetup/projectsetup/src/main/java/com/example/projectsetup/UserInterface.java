package com.example.projectsetup;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<UserModel, Long> {
}

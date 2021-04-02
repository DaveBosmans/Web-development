package com.example.projectsetup;

import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {

    @Autowired
    private UserInterface repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        UserModel user = new UserModel();
        user.setEmail("albayraksafety@gmail.com");
        user.setPassword("password");
        user.setFirstName("Abdusselam");
        user.setLastName("Albayrak");

        UserModel savedUser = repo.save(user);

        UserModel existUser = entityManager.find(UserModel.class, savedUser.getId());

        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }
}

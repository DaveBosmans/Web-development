package com.example.demo;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
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
public class MessageRepositoryTest {
    @Autowired
    private MessageRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateNewMessage(){
        Message message = new Message();
        message.setMessage("Dit is een test message");
        Message savedMessage = repo.save(message);
        Message existMessage = entityManager.find(Message.class, savedMessage.getId());
        assertThat(existMessage.getMessage()).isEqualTo(message.getMessage());
    }
}

package com.example.demo.rest;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class MessageController {
//    @GetMapping(path = "")
//    public String displayContent(){
//        return "redirect:index.html";
//    }

    @Autowired
    private MessageRepository repo;

    @GetMapping(path = "/message")
    public ResponseEntity<List<Message>> getAllMessages(HttpServletRequest request){
        try{
            List<Message> messagesList = new ArrayList<>();
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

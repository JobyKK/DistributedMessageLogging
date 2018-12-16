package com.example.rest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.example.rest.entity.Message;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MessageRest {
    @RequestMapping("/messages")
    public List<Message> messages() {
        List<Message> list = Arrays.asList(
            new Message("1", new Date()),
            new Message("2", new Date()),
            new Message("3", new Date())
        );

        return list;
    }
}
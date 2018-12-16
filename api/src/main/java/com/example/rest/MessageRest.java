package com.example.rest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.example.rest.entity.Message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageRest {
    Logger logger = LoggerFactory.getLogger(MessageRest.class);

    @RequestMapping(value="/", method=RequestMethod.GET)
    public List<Message> getMessages() {
        logger.info("Request all messages");

        List<Message> list = Arrays.asList(
            new Message("1", new Date()),
            new Message("2", new Date()),
            new Message("3", new Date())
        );

        return list;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Message getMessage(@PathVariable("id") String id) {
        logger.info(String.format("Request a message with id: %s", id));

        return new Message("1", new Date());
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public void addMessage(@RequestBody Message message) {
        logger.info(String.format("Create new message with text: %s", message.getText()));
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public void updateMessage(@PathVariable("id") String id, @RequestBody Message message) {
        logger.info(String.format("Update a message with id: %s", id));
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteMessage(@PathVariable("id") String id) {
        logger.info(String.format("Delete a message with id: %s", id));
    }
}
package com.chandan.portfolio.controller;

import com.chandan.portfolio.model.Contact;
import com.chandan.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        
        logger.info("📩 New Contact Request:");
        logger.info("Name: {} {}", contact.getFirstname(), contact.getLastname());
        logger.info("Email: {}", contact.getEmail());
        logger.info("Phone: {}", contact.getPhone());
        logger.info("Message: {}", contact.getMessage());

        return contactRepository.save(contact);
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
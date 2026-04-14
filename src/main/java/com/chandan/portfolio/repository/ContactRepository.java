package com.chandan.portfolio.repository;

import com.chandan.portfolio.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;


public interface ContactRepository extends JpaRepository<Contact, UUID> {
}   
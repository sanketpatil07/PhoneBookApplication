package com.Sanket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sanket.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}

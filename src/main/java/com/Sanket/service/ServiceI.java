package com.Sanket.service;

import java.util.List;

import com.Sanket.model.Contact;

public interface ServiceI {

	boolean savecontact(Contact contact);
	
	List<Contact> getallcontact();
	
	Contact getContactById(Integer cid);
}

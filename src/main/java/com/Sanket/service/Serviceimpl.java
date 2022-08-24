package com.Sanket.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sanket.Repository.ContactRepository;
import com.Sanket.model.Contact;

@Service
public class Serviceimpl implements ServiceI{

	@Autowired
	private ContactRepository contactrepository;
	
	@Override
	public boolean savecontact(Contact contact) {
		
		Contact save = contactrepository.save(contact);
		if(save!=null) {
			return true;
		}else
		return false;
	}

	@Override
	public List<Contact> getallcontact() {
		
		List<Contact> findAll = contactrepository.findAll();
		
		return findAll;
	}

	
	@Override
	public Contact getContactById(Integer cid) {

		 Contact findById = contactrepository.findById(cid).get();
		
		return findById;
			
		 }
	

	}

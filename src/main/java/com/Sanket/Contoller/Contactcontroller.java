package com.Sanket.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sanket.model.Contact;
import com.Sanket.service.ServiceI;

@RestController
public class Contactcontroller {

	@Autowired
	private ServiceI servicei;
	
	@PostMapping(value="/savecontact",consumes="application/json" )
	public ResponseEntity<String> savecontact(@RequestBody Contact contact){
		
		boolean savecontact = servicei.savecontact(contact);
		
		if(savecontact=true) {
			String msg="contact save successfully";
			
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}else {
			String msg="contact not save";
		return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST) ;
	}
	
}
	@GetMapping(value="getallcontact", produces="application/json")
	public ResponseEntity<List<Contact>> getallcontact(){
		
		List<Contact> getallcontact = servicei.getallcontact();
		
		return new ResponseEntity<List<Contact>>(getallcontact,HttpStatus.OK);
		
			}
	
	
	@GetMapping(value="getContactbyid/{cid}", produces="application/json")
	public ResponseEntity<Contact> getContactbyid(@PathVariable Integer cid){
		
		Contact getcontactByCid = servicei.getContactById(cid);
		
		return new ResponseEntity<Contact>(getcontactByCid,HttpStatus.OK);
			
	}

	@PutMapping(value="updatecontact", produces="application/json")
	public ResponseEntity<String> updatecobtact( @RequestBody  Contact contact){
		boolean updatecontact = servicei.updatecontact(contact);
		
		if(updatecontact== true) {
			
			String msg ="updatev sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}else {
		
		String msg ="update not sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);	}
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


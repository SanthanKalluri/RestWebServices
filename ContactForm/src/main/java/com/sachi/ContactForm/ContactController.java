package com.sachi.ContactForm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sachi.ContactForm.DAO.ContactRepository;
import com.sachi.ContactForm.beans.Contact;
import com.sachi.ContactForm.beans.StoreContact;
import com.sachi.ContactForm.entity.ContactEntity;


@RestController
public class ContactController {

	@Autowired
    ContactRepository contactRepository;
	
	@GetMapping("/getAllContacts")
	public List<ContactEntity> getAllContact() {
		
		return contactRepository.findAll();
	}

	@GetMapping("/storeContact")
	public ContactEntity storeContactService(ContactEntity contact) {
		ContactEntity out =  new ContactEntity();
		out = contactRepository.save(contact);

		return out;

	}
}

package com.Springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot.dao.UserRepository;
import com.Springboot.entities.Books;

@Service
public class BookServices {
	@Autowired
	private UserRepository userRepo;

	public List<Books> getAllBooks() {
		List<Books> li=(List<Books>)userRepo.findAll();
		return li;
	}

	public Books getBook(int id) {
		
		Optional<Books> opt= userRepo.findById(id);
		Books b=opt.get();
		return b;
	}

	public void addBooks(Books b) {
		
		this.userRepo.save(b);
		System.out.println("Added : "+b);
		
	}

	public void updateBook(Books b) {
		
		this.userRepo.save(b);
		
	}

	public void deleteBook(int id) {
		
		this.userRepo.deleteById(id);
		
	}
	
	

}

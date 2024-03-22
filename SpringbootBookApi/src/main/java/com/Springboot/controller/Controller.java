package com.Springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.entities.Books;
import com.Springboot.services.BookServices;

@RestController
public class Controller {
	@Autowired
	private BookServices bookServices;
	@GetMapping("/books")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<List<Books>> getBooks()
	{
		try
		{
			List<Books> li=this.bookServices.getAllBooks();
			
			if(li.size()<=0)
			{
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
			return ResponseEntity.of(Optional.of(li));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
	@GetMapping("/books/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Books> getBook(@PathVariable("id") int id)
	{
		try
		{
			Books b=this.bookServices.getBook(id);
			return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
	
	@PostMapping("/books")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<String> addBook(@RequestBody Books b)
	{
		try
		{
			this.bookServices.addBooks(b);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
		}

	}
	@PutMapping("/books")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<String> updateBook(@RequestBody Books b)
	{
		try
		{
			this.bookServices.updateBook(b);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}
	
	}
	
	@DeleteMapping("/books/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<String> deleteBook(@PathVariable("id") int id)
	{
		try
		{
			this.bookServices.deleteBook(id);
			return ResponseEntity.ok().body("deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY).build();
		}
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



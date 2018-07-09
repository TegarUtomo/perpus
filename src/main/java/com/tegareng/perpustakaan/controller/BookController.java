package com.tegareng.perpustakaan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tegareng.perpustakaan.model.BookModel;
import com.tegareng.perpustakaan.service.BookIService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookIService bookService;
	
	@GetMapping("/all")
	public List<BookModel> getListbook(){
		
		// todo : exception handling
		List<BookModel> result = bookService.getList();
		
		if(result == null){
			return new ArrayList<>();
		}
		return result;
	}
	
	@GetMapping
	public BookModel getBook(@RequestParam("id") String id){
		
		// todo: exception handling
		if(id == null || id.trim().isEmpty()){
			return null;
		}
		return bookService.getOne(id);
	}
}

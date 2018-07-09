package com.tegareng.perpustakaan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tegareng.perpustakaan.model.BookModel;
import com.tegareng.perpustakaan.service.BookIService;

@RestController("/book")
public class BookController {
	
	@Autowired
	private BookIService bookService;
	
	@GetMapping(path = "/all")
	public List<BookModel> getListbook(){
		return bookService.getList();
	}
}

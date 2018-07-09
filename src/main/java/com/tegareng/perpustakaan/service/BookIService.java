package com.tegareng.perpustakaan.service;

import java.util.List;

import com.tegareng.perpustakaan.model.BookModel;

public interface BookIService {
	
	public List<BookModel> getList();
	
	public BookModel getOne(String id);
}

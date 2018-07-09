package com.tegareng.perpustakaan.dao;

import java.util.List;

public interface BaseIDAO<T> {
	
	public void save(T entity);
	public void edit(T entity);
	public void delete(T entity);
	public List<T> findAll();
	public T findOne(String id);
	
}

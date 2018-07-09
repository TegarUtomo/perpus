package com.tegareng.perpustakaan.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tegareng.perpustakaan.dao.BookIDao;
import com.tegareng.perpustakaan.entity.BookEntity;

@Repository
public class BookDaoImpl extends AbstractDAOImpl<BookEntity> implements BookIDao{

	public BookDaoImpl() {
		super(BookEntity.class);
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}

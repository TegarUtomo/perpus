package com.tegareng.perpustakaan.daoimpl;

import org.springframework.stereotype.Repository;

import com.tegareng.perpustakaan.dao.BookIDao;
import com.tegareng.perpustakaan.entity.BookEntity;

@Repository
public class BookDaoImpl extends AbstractDAOImpl<BookEntity> implements BookIDao {

	public BookDaoImpl() {
		super(BookEntity.class);
	}
}

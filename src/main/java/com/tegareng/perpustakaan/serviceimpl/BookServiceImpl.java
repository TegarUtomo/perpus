package com.tegareng.perpustakaan.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tegareng.perpustakaan.dao.BookIDao;
import com.tegareng.perpustakaan.entity.BookEntity;
import com.tegareng.perpustakaan.model.BookModel;
import com.tegareng.perpustakaan.service.BookIService;

@Service
@Transactional
public class BookServiceImpl implements BookIService {

	@Autowired
	private BookIDao bookDao;

	@Override
	public List<BookModel> getList() {

		List<BookModel> modelList = new ArrayList<>();
		List<BookEntity> entityList = bookDao.findAll();

		if (entityList != null) {

			for (BookEntity e : entityList) {

				BookModel m = toModel(e);
				modelList.add(m);
			}
		}

		return modelList;
	}

	@Override
	public BookModel getOne(String id) {
		
		BookEntity entity = bookDao.findOne(id);
		
		return toModel(entity);
	}

	private BookModel toModel(BookEntity entity) {
		
		if(entity == null){
			return null;
		}
		
		BookModel model = new BookModel();
		model.setId(entity.getId());
		model.setName(entity.getNama());
		model.setDesc(entity.getDeskripsi());

		return model;

	}
}

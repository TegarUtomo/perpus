package com.tegareng.perpustakaan.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tegareng.perpustakaan.dao.BaseIDAO;

public class AbstractDAOImpl<T> implements BaseIDAO<T> {
	
	private Class<T> entityClass;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public AbstractDAOImpl(Class<T> entityClass){
		this.entityClass = entityClass;
	}
	
	protected Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(T entity) {
		getCurrentSession().persist(entity);
	}

	@Override
	public void edit(T entity) {
		getCurrentSession().merge(entity);
	}

	@Override
	public void delete(T entity) {
		getCurrentSession().remove(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return getCurrentSession().createQuery("FROM "+entityClass.getName()).list();
	}

	@Override
	public T findOne(String id) {
		return (T) getCurrentSession().get(entityClass, id);
	}

}

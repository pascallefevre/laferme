package com.dao.model;

import java.util.List;

public interface GenericDAO <K, T>
{

	public List<T> findAll();
	public T findByKey(K id);
	public  void insert(T obj);
	public void update(T obj);
	public void deleteByKey(K id);
	
}

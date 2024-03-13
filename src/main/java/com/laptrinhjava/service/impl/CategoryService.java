package com.laptrinhjava.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjava.dao.ICategoryDAO;
import com.laptrinhjava.dao.impl.CategoryDAO;
import com.laptrinhjava.model.CategoryModel;
import com.laptrinhjava.service.ICategoryService;

public class CategoryService implements ICategoryService {

	/*private ICategoryDAO categoryDAO;
	public CategoryService () {
		categoryDAO  = new CategoryDAO();
	}*/
	
	@Inject
	private ICategoryDAO categoryDAO;
	
	
	@Override
	public List<CategoryModel> finlAll() {
		return categoryDAO.findAll();
	}
	

}

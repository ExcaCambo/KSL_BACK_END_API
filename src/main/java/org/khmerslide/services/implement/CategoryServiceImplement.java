package org.khmerslide.services.implement;

import java.util.ArrayList;

import org.khmerslide.entities.Category;
import org.khmerslide.repositories.CategoryRepository;
import org.khmerslide.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImplement implements CategoryService{

	@Autowired
	private CategoryRepository  categoryRepository;
	@Override
	public ArrayList<Category> getCategory() {
		return categoryRepository.getCategory();
	}

	@Override
	public boolean addCategory(Category category) {
		return categoryRepository.addCategory(category);
	}

	@Override
	public boolean updateCategory(Category category) {
		return categoryRepository.updateCategory(category);
	}

	@Override
	public boolean deleteCategory(int cat_id) {
		return categoryRepository.deleteCategory(cat_id);
	}

}

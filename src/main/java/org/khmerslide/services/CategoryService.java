package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.Category;
import org.khmerslide.entities.Document;
import org.khmerslide.entities.User;

public interface CategoryService {
	public ArrayList<Category> getCategory();
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(int cat_id);
	public ArrayList<Category> getCategoryById(int cate_id);
}

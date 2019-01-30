package net.kristi.onlineShoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kristi.onlineShoppingBackend.dao.CategoryDAO;
import net.kristi.onlineShoppingBackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		//First category
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("Extra info about Category 1");
		category.setImageURL("category1.png");;
		categories.add(category);
		
		//Second Category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Extra info about Category 2");
		category.setImageURL("category2.png");
		categories.add(category);
		
		
		//Third Category
		category = new Category();
		category.setId(2);
		category.setName("Computers");
		category.setDescription("Extra info about Category 3");
		category.setImageURL("category3.png");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category getId(int id) {
		
		for (Category category : categories) {
			
			if(category.getId() == id) {
				return category;
			}
			
		}
		
		return null;
	}

}

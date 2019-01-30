package net.kristi.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kristi.onlineShoppingBackend.dao.CategoryDAO;
import net.kristi.onlineShoppingBackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//listCategories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickHome", true);
		
		
		return mv;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	
	/*
	 * Show all products
	 * */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		//listCategories
		mv.addObject("categories", categoryDAO.list());	
		mv.addObject("userClickAllProducts", true);

		return mv;
	}
	
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {

		ModelAndView mv = new ModelAndView("page");
		
		Category category = null;
		category = categoryDAO.getId(id);
		mv.addObject("title", category.getName());
		
		//listCategories
		mv.addObject("categories", categoryDAO.list());
		//single products
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts", true);
		
		return mv;
	}
	
	
}

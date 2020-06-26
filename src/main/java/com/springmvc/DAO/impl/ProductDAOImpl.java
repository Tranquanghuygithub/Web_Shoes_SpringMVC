package com.springmvc.DAO.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.ProductDAO;
import com.springmvc.entity.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	public void addProduct(Product product) {
		// xem lai cho nay co can them agrument: mutipartfile ko
		sessionFactory.getCurrentSession().save(product);
		
	}

	@Override
	public void updateProduct(Product product) {
		sessionFactory.getCurrentSession().merge(product);
		
	}

	@Override
	public void deleteProduct(long id) {
		Product product= getProductById(id);
		sessionFactory.getCurrentSession().delete(product);
		
	}

	@Override
	public Product getProductById(long id) {
		return(Product)sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductByName(String name) {

		Criteria cr= sessionFactory.getCurrentSession().createCriteria(Product.class);
		cr.add(Restrictions.eq("name", name));
		return cr.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProduct() {
		
		Criteria cr= sessionFactory.getCurrentSession().createCriteria(Product.class);
		return cr.list();
	}





}

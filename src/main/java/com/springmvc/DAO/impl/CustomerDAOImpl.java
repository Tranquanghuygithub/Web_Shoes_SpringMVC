package com.springmvc.DAO.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.CustomerDAO;
import com.springmvc.entity.Customer;

@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public Customer getCusByUsername(String username) {
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, username);
	}


	@Override
	public void addCustomer(Customer cus) {
		sessionFactory.getCurrentSession().save(cus);
	}


	@Override
	public void updateCus(Customer cus) {
		sessionFactory.getCurrentSession().merge(cus);
		
	}

}

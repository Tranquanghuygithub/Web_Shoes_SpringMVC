package com.springmvc.DAO.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.OrderDAO;
import com.springmvc.entity.Order;

@Repository
@Transactional
public class OrderDAOImpl implements OrderDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public long addOrder(Order order) {
		return (long) sessionFactory.getCurrentSession().save(order);
		
	}

	@Override
	public void delete(long id) {
		sessionFactory.getCurrentSession().delete(findById(id));
	}

	@Override
	public Order findById(long id) {
		
		return (Order) sessionFactory.getCurrentSession().get(Order.class, id);
	}

}

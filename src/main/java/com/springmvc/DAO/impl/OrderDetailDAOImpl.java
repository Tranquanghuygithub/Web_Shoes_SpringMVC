package com.springmvc.DAO.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.OrderDetailDAO;
import com.springmvc.entity.OrderDetail;

@Repository
@Transactional
public class OrderDetailDAOImpl implements OrderDetailDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addOrder(List<OrderDetail> orderDetails) {
		for(OrderDetail orderDetail:orderDetails) {
			sessionFactory.getCurrentSession().save(orderDetail);
		}
		
		
	}

	@Override
	public void delete(long id) {
		sessionFactory.getCurrentSession().delete(findById(id));
	}

	@Override
	public OrderDetail findById(long id) {
		
		return (OrderDetail) sessionFactory.getCurrentSession().get(OrderDetail.class, id);
	}

}

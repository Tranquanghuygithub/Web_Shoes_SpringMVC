package com.springmvc.DAO.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.ShippingDAO;
import com.springmvc.entity.Shipping;
@Repository
@Transactional
public class ShippingDAOImpl implements ShippingDAO {
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Shipping> getAllShipping() {
		Criteria cr= sessionFactory.getCurrentSession().createCriteria(Shipping.class);
		return cr.list();
	}

	@Override
	public Shipping getShippingById(long id) {
		return (Shipping) sessionFactory.getCurrentSession().get(Shipping.class, id);
	}

}

package com.springmvc.DAO.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.AddressCheckoutDAO;
import com.springmvc.entity.AddressCheckout;

@Repository
@Transactional
public class AddressCheckoutDAOImpl implements AddressCheckoutDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public AddressCheckout getLastRecord() {
		Query query = sessionFactory.getCurrentSession().createQuery("FROM addresscheckout  ORDER BY id DESC");
		query.setMaxResults(1);
		AddressCheckout last =  (AddressCheckout) query.uniqueResult();
		return last;
	}

	@Override
	public AddressCheckout getAddressById(long id) {
		return (AddressCheckout) sessionFactory.getCurrentSession().get(AddressCheckout.class, id);
	}

	@Override
	public long addAddressCheckout(AddressCheckout address) {
		return (long) sessionFactory.getCurrentSession().save(address);
		
	}

	@Override
	public void updateAddressCheckout(AddressCheckout address) {
		sessionFactory.getCurrentSession().merge(address);
		
	}


}

package com.springmvc.DAO.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.AddressDAO;
import com.springmvc.entity.Address;

@Repository
@Transactional
public class AddressDAOImpl implements AddressDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addAddress(Address address) {
		sessionFactory.getCurrentSession().save(address);
	}

	@Override
	public Address getAddressById(long id) {
		return (Address) sessionFactory.getCurrentSession().get(Address.class, id);
	}

	@Override
	public void updateAddress(Address address) {
		sessionFactory.getCurrentSession().merge(address);
		
	}

}

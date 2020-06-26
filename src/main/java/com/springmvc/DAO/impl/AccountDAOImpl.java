package com.springmvc.DAO.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.AccountDAO;
import com.springmvc.entity.Account;
@Repository
@Transactional
public class AccountDAOImpl implements AccountDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Account findAccount(String username) {
		return (Account) sessionFactory.getCurrentSession().get(Account.class, username);
	}

	@Override
	public long addAccount(Account account) {
		return (long) sessionFactory.getCurrentSession().save(account);
		
	}

}

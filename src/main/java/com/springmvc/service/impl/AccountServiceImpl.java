package com.springmvc.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.AccountDAO;
import com.springmvc.entity.Account;
import com.springmvc.model.AccountDTO;
import com.springmvc.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDAO accountDAO;

	
	@Override
	public Account convertToEntity(AccountDTO accountDTO) {
		ModelMapper modelMapper= new ModelMapper();
		Account account = modelMapper.map(accountDTO, Account.class);
		return account;	
	}
	@Override
	public AccountDTO convertToDTO(Account account) {
		ModelMapper modelMapper= new ModelMapper();
		AccountDTO accountDTO = modelMapper.map(account, AccountDTO.class);
		return accountDTO;			
	}

	
	@Override
	public AccountDTO findAccount(String username) {
		 Account account=accountDAO.findAccount(username);
		 AccountDTO accountDTO = convertToDTO(account);
		 return accountDTO;
	}
	@Override
	public long addAccount(AccountDTO accountDTO) {
		Account account= convertToEntity(accountDTO);
	    return accountDAO.addAccount(account); 
	}




}

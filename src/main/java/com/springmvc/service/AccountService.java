package com.springmvc.service;

import com.springmvc.entity.Account;
import com.springmvc.model.AccountDTO;

public interface AccountService {
	 AccountDTO findAccount(String username);
	 Account convertToEntity(AccountDTO accountDTO);
	 AccountDTO convertToDTO( Account account);
	 long addAccount(AccountDTO accountDTO);
}

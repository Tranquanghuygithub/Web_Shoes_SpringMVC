package com.springmvc.DAO;

import com.springmvc.entity.Account;

public interface AccountDAO {
	 Account findAccount(String username);
	 long addAccount(Account account);
}

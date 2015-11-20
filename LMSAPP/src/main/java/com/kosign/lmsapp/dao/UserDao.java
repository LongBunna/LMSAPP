package com.kosign.lmsapp.dao;

import com.kosign.lmsapp.entity.User;

public interface UserDao {
	 
    User findById(int id);
     
    User findBySSO(String sso);
     
}

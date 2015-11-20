package com.kosign.lmsapp.service;

import com.kosign.lmsapp.entity.User;

public interface UserService {
	 
    User findById(int id);
     
    User findBySso(String sso);
     
}

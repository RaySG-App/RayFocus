package com.cn.honey.service;

import com.cn.honey.model.User;

public interface UserService {
	
	  public abstract int insertUser(User paramUser);

	  public abstract void updateUser(User paramUser);

	  public abstract User findUser(User paramUser);

	  public abstract void deleteUser(Integer paramInteger);

	  public abstract User findUsers(Integer paramInteger);
}

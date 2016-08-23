package com.cn.honey.Dao;

import com.cn.honey.model.User;

public abstract interface UserDao{
	
	public abstract int insert(User paramUser);

	public abstract void update(User paramUser);

	public abstract User find(User paramUser);

	public abstract void delete(Integer paramInteger);

	public abstract User finds(Integer paramInteger);
}
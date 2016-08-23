package com.cn.honey.serviceImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.honey.Dao.UserDao;
import com.cn.honey.model.User;
import com.cn.honey.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService{

  @Autowired
  private UserDao userDao;

  public int insertUser(User user)
  {
    int result = this.userDao.insert(user);
    System.out.println(result);
    return result;
  }

  public void updateUser(User user)
  {
    this.userDao.update(user);
  }

  public User findUser(User user)
  {
    User userList = this.userDao.find(user);
    return userList;
  }

  public void deleteUser(Integer userId)
  {
    this.userDao.delete(userId);
  }

  public User findUsers(Integer userId)
  {
    User userList = this.userDao.finds(userId);
    return userList;
  }
}

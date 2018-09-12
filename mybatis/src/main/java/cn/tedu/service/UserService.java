package cn.tedu.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tedu.pojo.User;

public interface UserService {
  List<User> find();
  public User get(Integer id);
  public void update(User user);
  public void delete(Integer id);
  void insert(User user);
}

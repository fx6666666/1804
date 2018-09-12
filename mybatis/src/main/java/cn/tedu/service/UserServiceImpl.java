package cn.tedu.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.tedu.mapper.UserMapper;
import cn.tedu.pojo.User;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	public List<User> find() {
		return userMapper.find();
	}
    
	public User get(Integer id){
		return userMapper.get(id);
	}
	
	public void update(User user){
		userMapper.update(user);
	}
	
	public void delete(Integer id){
		userMapper.delete(id);
	}

	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}
}

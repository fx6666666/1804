package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.pojo.User;

//Spring框架整合mybatis框架，spring启动时去mapper目录，进行包扫描，扫描所有mapper接口，创建
public interface UserMapper {
  public List<User> find();
  //注解方式的sql
  @Select("select id,name,birthday,address from user where id=#{id}")
  public User get(@Param("id") Integer id);
  
  @Update("update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
  public void update(User user);
  
  @Delete("delete from user where id=#{id}")
  public void delete(Integer id);
  
  @Delete("insert into user(id,name,birthday,address) values (null,#{name},#{birthday},#{address})")
  public void insert(User user);
}

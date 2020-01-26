package com.java456.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.java456.entity.User;



public interface UserDao    extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {
	
	
	public User findByName(String name);
	
	
	
}

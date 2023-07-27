package com.boot.sprint1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.sprint1.entity.user;
import com.boot.sprint1.repository.userrepository;

@Service
public class userserviceimplements implements userservice{
	
	@Autowired
	private userrepository  user1repository;

	@Override
	public user createuser(user use1) {
		// TODO Auto-generated method stub
		return user1repository.save(use1);
	}

	@Override
	public List<user> getusers() {
		// TODO Auto-generated method stub
		return (List<user>) user1repository.findAll();
	}

	@Override
	public user getuserById(long id) {
		// TODO Auto-generated method stub
		return user1repository.findById(id).get();
	}

	@Override
	public void deleteuser(long id) {
		// TODO Auto-generated method stub
		user1repository.deleteById(id);
	}

	@Override
	public user updateuser(user use1, long id) {
		// TODO Auto-generated method stub
		user user1=user1repository.findById(id).get();
		user1.setEmail(use1.getEmail());
		user1.setphNo(use1.getphNo());
		user1.setAddress(use1.getAddress());
		user1.setName(use1.getName());
		return user1repository.save(user1);
	}	
}

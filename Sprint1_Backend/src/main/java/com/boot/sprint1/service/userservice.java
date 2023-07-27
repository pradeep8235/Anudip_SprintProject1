package com.boot.sprint1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.sprint1.entity.user;
@Service
public interface userservice {
	
      public user createuser(user use1);
      
      public List<user> getusers();
      
      public user getuserById(long id);
      
      public void deleteuser(long id);
      
      public user updateuser(user use1,long id);
      
}

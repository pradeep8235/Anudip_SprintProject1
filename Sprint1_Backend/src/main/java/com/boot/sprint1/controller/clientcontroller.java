package com.boot.sprint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.sprint1.entity.user;
import com.boot.sprint1.repository.userrepository;
import com.boot.sprint1.service.userservice;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class clientcontroller {
	@Autowired
	private userservice user1service;
	
	 @PostMapping("/add")
	 public user createuser(@RequestBody user use1) {
		 user use=user1service.createuser(use1);
		 return use; 
	 }
	 @GetMapping("/users")
	 public List<user> getusers(){
		 return user1service.getusers();
	 }
	 
	 @PutMapping("/update/{id}")
	 public user updateuserById(@RequestBody user use1, @PathVariable("id") long id) {
		 return user1service.updateuser(use1, id);
	 }
	 @DeleteMapping("/delete/{id}")
	 public String deleteuser(@PathVariable("id")long id) {
		 user1service.deleteuser(id);
		 return "user deleted successfully";
	 }
	 @GetMapping("/user/{id}")
	 public user getuserById(@PathVariable("id")long id) {
		 return user1service.getuserById(id);
	 }
	 
}

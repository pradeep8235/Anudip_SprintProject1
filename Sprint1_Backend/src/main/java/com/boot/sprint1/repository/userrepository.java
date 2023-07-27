package com.boot.sprint1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.sprint1.entity.user;

@Repository
public interface userrepository extends CrudRepository<user, Long>{

}

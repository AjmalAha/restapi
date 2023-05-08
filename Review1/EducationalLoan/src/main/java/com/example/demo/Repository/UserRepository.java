package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{
	UserModel findByEmail(String email);

}



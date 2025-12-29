package com.example.demo.User;

import java.util.List;

public interface UserService {

	UserEntity createUser(UserEntity user);

	UserEntity getUserById(Long Id);

	List<UserEntity> getUser();

}

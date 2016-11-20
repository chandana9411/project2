package com.niit.collab.DAO;

import java.util.List;

import com.niit.collab.model.Users;

public interface UsersDAO
{
public boolean save(Users users);
public boolean update(Users users);
public Users validate(int user_id,String password);
public Users get(int user_id);
public List<Users> getAllUsers();	
}

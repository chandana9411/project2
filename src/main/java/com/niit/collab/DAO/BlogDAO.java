package com.niit.collab.DAO;

import java.util.List;

import com.niit.collab.model.Blog;

public interface BlogDAO 
{

	public boolean Save(Blog blog);
	public boolean Update(Blog blog);
	public boolean delete(Blog blog);
	public Blog get(int b_id);
	public List<Blog> list();
	
}

package com.nicholas.pucpr.appweb.repository;

import java.util.List;

import com.nicholas.pucpr.appweb.domain.Post;

public interface PostRepository {

	List<Post> findAll();
	
	void persist(Post post);
}

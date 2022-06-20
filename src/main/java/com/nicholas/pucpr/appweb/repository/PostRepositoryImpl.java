package com.nicholas.pucpr.appweb.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.nicholas.pucpr.appweb.domain.Post;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class PostRepositoryImpl implements PostRepository {

	@PersistenceContext(unitName = "persistenceUnit")
	private EntityManager em;

	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("FROM Post p", Post.class).getResultList();
	}

	@Override
	public void persist(Post post) {
		em.persist(post);
		
	}

}

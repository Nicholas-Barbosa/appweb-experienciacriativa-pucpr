package com.nicholas.pucpr.appweb.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.nicholas.pucpr.appweb.dto.PostDTO;
import com.nicholas.pucpr.appweb.repository.PostRepository;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class PostServiceImpl implements PostService {

	@Inject
	private PostRepository repository;

	@Override
	public List<PostDTO> findAll() {
		return repository.findAll().stream().map(PostDTO::fromDomain).collect(Collectors.toList());
	}

}

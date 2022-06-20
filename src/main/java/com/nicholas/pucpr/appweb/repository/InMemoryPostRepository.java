package com.nicholas.pucpr.appweb.repository;

import java.time.LocalDate;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

import com.nicholas.pucpr.appweb.domain.Post;

@ApplicationScoped
@InMemoryRepository
public class InMemoryPostRepository implements PostRepository {

	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return List.of(new Post(LocalDate.of(2022, 6, 19), "Lançamento Java 17",
				"O Java 17 é o mais recente lançamento de Suporte de Longo Prazo (LTS) sob a cadência de lançamento de seis meses do Java e é fruto de uma ampla colaboração dos times de engenharia da Oracle e outros membros da comunidade mundial de profissionais de desenvolvimento Java, por meio da OpenJDK Community e do Java Community Process (JCP). "));
	}

	@Override
	public void persist(Post post) {
		// TODO Auto-generated method stub

	}

}

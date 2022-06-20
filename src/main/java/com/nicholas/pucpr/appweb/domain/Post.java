package com.nicholas.pucpr.appweb.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "post")
@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate createdAt;
	private String title;
	private String content;

	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post( LocalDate createdAt, String title, String content) {
		super();
		this.createdAt = createdAt;
		this.title = title;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

}

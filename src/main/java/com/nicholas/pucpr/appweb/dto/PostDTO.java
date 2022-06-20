package com.nicholas.pucpr.appweb.dto;

import java.time.LocalDate;

import com.nicholas.pucpr.appweb.domain.Post;

public class PostDTO {

	private String title, content;
	private LocalDate createdAt;

	public PostDTO() {
		// TODO Auto-generated constructor stub
	}

	public PostDTO(String title, String content, LocalDate createdAt) {
		super();
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public static PostDTO fromDomain(Post post) {
		return new PostDTO(post.getTitle(), post.getContent(), post.getCreatedAt());
	}
}

package com.nara.joblisting.repository;

import java.util.List;

import com.nara.joblisting.models.Post;

public interface SearchRepository {
	List<Post> findByText(String text);
}

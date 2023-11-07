package com.nara.joblisting.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nara.joblisting.models.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	

}

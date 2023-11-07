package com.nara.joblisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nara.joblisting.models.Post;
import com.nara.joblisting.repository.PostRepository;
import com.nara.joblisting.repository.SearchRepository;

@RestController
@CrossOrigin
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private SearchRepository searchRepository;
	
	@GetMapping("/allPosts")
	public List<Post> getAllPosts(){
		return postRepository.findAll();
	}
	
	@PostMapping("/addPost")
	public Post addPost(@RequestBody Post post) {
		return postRepository.insert(post);
	}
	
	@GetMapping("/posts/{text}")
	public List<Post> searchPost(@PathVariable("text") String text){
		return searchRepository.findByText(text);
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blitz.webforum.services;

import com.blitz.webforum.interfaces.PostInterface;
import com.blitz.webforum.models.Post;
import com.blitz.webforum.repositories.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Ghufran Tripa
 */
public class PostService implements PostInterface{
    
    @Autowired
    private PostRepository postRepository;
    
    @Override
    public void postToDB(long user_id, long category_id, String content_post) {
        Post p = new Post ();
        p.setUser_id(user_id);
        p.setCategory_id(category_id);
        p.setContent_post(content_post);
        
        postRepository.save(p);
    }

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blitz.webforum.services;

import com.blitz.webforum.interfaces.PostInterface;
import static com.blitz.webforum.interfaces.PostInterface.p;
import com.blitz.webforum.models.Post;
import com.blitz.webforum.repositories.PostRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ghufran Tripa
 */
@Service
public class PostService implements PostInterface{
    
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    public void store(Post post) {
        this.postRepository.save(post);
    }

    @Override
    public Post getById(long id) {
        Optional<Post> optional = postRepository.findById(id);

        if (!optional.isPresent()) {
            throw new RuntimeException(" Post not found for id :: " + id);
        }

        Post post = optional.get();
        return post;
    }

    @Override
    public void delete(long id) {
        this.postRepository.deleteById(id);
    }

    @Override
    public List<Post> findByUserId(long user_id) {
        return postRepository.findByUserId(user_id);
    }
            
   @Override
    public void postToDB(long user_id, long category_id, String desc){
         Post p = new Post();
         
         p.setUser(user_id);
         p.setCategory(category_id);
         p.setContentpost(desc);
         
         postInterface.save(p);
    }
        
    @Override
    public void postToDB(long user_id, long category, String name, String desc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
}
}

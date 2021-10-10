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
 * @author Sendy.dr
 */
<<<<<<< HEAD
@Service
public class PostService implements PostInterface {
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
<<<<<<< HEAD
        Optional < Post > optional = postRepository.findById(id);
=======
        Optional<Post> optional = postRepository.findById(id);
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)

     if (!optional.isPresent()) {
        throw new RuntimeException(" Post not found for id : " + id);
     }

    Post post = optional.get();
    return post;
    }

    @Override
    public void delete(long id) {
    this.postRepository.deleteById(id);
=======
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
>>>>>>> parent of c582154 (menambahkan  table post dan category)
    }
<<<<<<< HEAD
=======

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }
    
}
<<<<<<< HEAD
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
}
=======
>>>>>>> parent of c582154 (menambahkan  table post dan category)

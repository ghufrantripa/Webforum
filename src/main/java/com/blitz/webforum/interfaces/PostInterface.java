/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blitz.webforum.interfaces;

import com.blitz.webforum.models.Post;
import java.util.List;

/**
 *
 * @author Sendy.dr
 */
public interface PostInterface {
<<<<<<< HEAD
<<<<<<< HEAD
    List<Post> getAll();
=======

    public static void save(Post p);
    List<Post> getAll();
    List<Post> findByUserId(long user_id);
<<<<<<< HEAD
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
    void store(Post post);
    Post getById(long id);
    void delete(long id);
    void postToDB(long user_id, long category_id, String desc);
<<<<<<< HEAD
=======
    void postToDB(long user_id, long category_id, String content_post);
    List <Post> getAll();
    
    
>>>>>>> parent of c582154 (menambahkan  table post dan category)
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
}

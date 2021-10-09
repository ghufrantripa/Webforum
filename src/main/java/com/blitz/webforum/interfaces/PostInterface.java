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
 * @author Ghufran Tripa
 */

public interface PostInterface {

    public static void save(Post p);
    List<Post> getAll();
    List<Post> findByUserId(long user_id);
    void store(Post post);
    Post getById(long id);
    void delete(long id);
    void postToDB(long user_id, long category_id, String desc);
}

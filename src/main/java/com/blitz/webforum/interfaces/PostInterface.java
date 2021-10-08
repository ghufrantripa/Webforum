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
    void postToDB(long user_id, long category_id, String content_post);
    List <Post> getAll();
    
    
}

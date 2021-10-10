/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blitz.webforum.repositories;

import com.blitz.webforum.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sendy.dr
 */
@Repository
<<<<<<< HEAD
public interface PostRepository extends JpaRepository<Post, Long> {
=======
public interface PostRepository extends JpaRepository<Post, Long>{
>>>>>>> parent of c582154 (menambahkan  table post dan category)
    
}

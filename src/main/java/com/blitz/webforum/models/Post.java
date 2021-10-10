/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blitz.webforum.models;

<<<<<<< HEAD
import java.util.Locale.Category;
=======
>>>>>>> parent of c582154 (menambahkan  table post dan category)
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sendy.dr
 */
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "category_id")
    private long category_id;

    @Column(name = "content_post")
    private String content_post;
    
  

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getCategory_id() {
        return category_id;
    }

<<<<<<< HEAD
    public User getUser() {
        return user;
<<<<<<< HEAD
=======
=======
    public void setCategory_id(long category_id) {
        this.category_id = category_id;
>>>>>>> parent of c582154 (menambahkan  table post dan category)
    }

    public String getContent_post() {
        return content_post;
    }

<<<<<<< HEAD
    public void setCategory(long category_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
    public void setContent_post(String content_post) {
        this.content_post = content_post;
>>>>>>> parent of c582154 (menambahkan  table post dan category)
    }
 
    
}
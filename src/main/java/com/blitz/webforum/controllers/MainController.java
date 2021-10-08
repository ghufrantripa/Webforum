/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blitz.webforum.controllers;

import com.blitz.webforum.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Ghufran Tripa
 */
@Controller
public class MainController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", postService.getAll());
        return "index";
    }
    
    @PostMapping("/post")
    public String postNew(@RequestParam("user_id") long user_id,
            @RequestParam("category_id") long category_id,
            @RequestParam("content") String content_post)
    {
        postService.postToDB(user_id, category_id, content_post);
        
        return "index";
    }

}

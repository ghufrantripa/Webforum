/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blitz.webforum.controllers;

import com.blitz.webforum.interfaces.PostInterface;
import com.blitz.webforum.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Sendy.dr
 */

@Controller
public class MainController {
    @Autowired
    private PostInterface postInterface;

    @GetMapping("/post")
    public String index(Model model) {
        model.addAttribute("list", postInterface.getAll());
        return "post/index";
    }

    @GetMapping("/post/create")
    public String create(Model model) {
        Post post = new Post();
        model.addAttribute("post", post);
        
        return "post/create";
    }

    @PostMapping("/post/store")
    public String store(@ModelAttribute("post") Post post) {
        postInterface.store(post);
        return "redirect:/post/";
    }
    
    @GetMapping("/post/{id}/edit")
    public String edit(@PathVariable(value = "id") long id, Model model) {
        Post post = postInterface.getById(id);

        model.addAttribute("post", post);
        return "post/edit";
    }

    @PostMapping("/post/{id}/delete")
    public String delete(@PathVariable(value = "id") long id) {
        postInterface.delete(id);
        return "redirect:/employee/" ;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blitz.webforum.controllers;

import com.blitz.webforum.interfaces.CategoryInterface;
import com.blitz.webforum.interfaces.PostInterface;
import com.blitz.webforum.models.Post;
import com.blitz.webforum.models.Category;
import com.blitz.webforum.models.User;
import com.blitz.webforum.services.PostService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    private PostInterface postInterface;
    
    @Autowired
    private CategoryInterface categoryInterface;

   @GetMapping("/")
    public String index(Model model,  HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        
        long user_id = (long) session.getAttribute("id");
        
        List<Post> post = postInterface.findByUserId(user_id);
        
        model.addAttribute("post", post);
        
        Post post = new Post();
        return "index";
    }
    
    
    @GetMapping("/post/create")
    public String create(Model model) {
        
        List<Category> categories = categoryInterface.getAll();
        model.addAttribute("category", categories);
        
        
        
        
        
        Post post = new Post();
        model.addAttribute("post", post);

        return "create";
    }

    @PostMapping("/post/store")
    public String store(@ModelAttribute("post") Post post, HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        
        User user = new User();
        user.setId((long) session.getAttribute("id"));
        
        post.setUser(user);

        postInterface.store(post);
        return "redirect:/";
    }

    @GetMapping("/post/{id}/edit")
    public String edit(@PathVariable(value = "id") long id, Model model) {
        List<Category> categories = categoryInterface.getAll();
        model.addAttribute("categories", categories);
        
        Post post = postInterface.getById(id);

        model.addAttribute("post", post);
        return "edit";
    }

    @PostMapping("/post/{id}/delete")
    public String delete(@PathVariable(value = "id") long id) {
        postInterface.delete(id);
        return "redirect:/";
    }
    
    
    

@GetMapping("/post/create")
private createPost(Model model){
	Post post = new Post();
	model.addAttribute("post", post);

}
    
@PostMapping("/post/store")
private postThread(@RequestParam("user_id") String user_id,
                   @RequestParam("category_id") long category_id,
                   @RequestParam("post_desc") String desc){
                postService.postToDB(user_id, category_id, desc);
                
}

	return "redirect:/";
        
    
} 



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blitz.webforum.controllers;

<<<<<<< HEAD
import com.blitz.webforum.interfaces.PostInterface;
import com.blitz.webforum.models.Post;
<<<<<<< HEAD
=======
import com.blitz.webforum.models.Category;
import com.blitz.webforum.models.User;
import com.blitz.webforum.services.PostService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
import com.blitz.webforum.services.PostService;
>>>>>>> parent of c582154 (menambahkan  table post dan category)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Sendy.dr
 */

@Controller
public class MainController {
<<<<<<< HEAD
    @Autowired
    private PostInterface postInterface;

    @GetMapping("/post")
    public String index(Model model) {
        model.addAttribute("list", postInterface.getAll());
        return "post/index";
    }

    @GetMapping("/post/create")
    public String create(Model model) {
=======

    @Autowired
<<<<<<< HEAD
<<<<<<< HEAD
    private PostService postService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", postService.getAll());
        return "index";
    }
    
<<<<<<< HEAD
=======
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
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
    
<<<<<<< HEAD
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
    
    @GetMapping("/post/create")
    public String create(Model model) {
        
        List<Category> categories = categoryInterface.getAll();
        model.addAttribute("category", categories);
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
        
        
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
        
        
        
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
        
        
        
        
        
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
        Post post = new Post();
        model.addAttribute("post", post);
        
        return "post/create";
    }

    @PostMapping("/post/store")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public String store(@ModelAttribute("post") Post post) {
        postInterface.store(post);
        return "redirect:/post/";
=======
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
    public String store(@ModelAttribute("post") Post post, HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        
        User user = new User();
        user.setId((long) session.getAttribute("id"));
        
        post.setUser(user);

        postInterface.store(post);
        return "redirect:/";
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
    }
    
    @GetMapping("/post/{id}/edit")
    public String edit(@PathVariable(value = "id") long id, Model model) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
        List<Category> categories = categoryInterface.getAll();
        model.addAttribute("categories", categories);
        
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
        List<Category> categories = categoryInterface.getAll();
        model.addAttribute("categories", categories);
        
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
        List<Category> categories = categoryInterface.getAll();
        model.addAttribute("categories", categories);
        
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
        Post post = postInterface.getById(id);

        model.addAttribute("post", post);
        return "post/edit";
    }

    @PostMapping("/post/{id}/delete")
    public String delete(@PathVariable(value = "id") long id) {
        postInterface.delete(id);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        return "redirect:/employee/" ;
    }
}
=======
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
        return "redirect:/";
=======
    @PostMapping("/post")
    public String postNew(@RequestParam("user_id") long user_id,
            @RequestParam("category_id") long category_id,
            @RequestParam("content") String content_post)
    {
        postService.postToDB(user_id, category_id, content_post);
        
        return "index";
>>>>>>> parent of c582154 (menambahkan  table post dan category)
    }
<<<<<<< HEAD
<<<<<<< HEAD

}
<<<<<<< HEAD
=======
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
    
    
    

@GetMapping("/post/create")
private createPost(Model model){
	Post post = new Post();
	model.addAttribute("post", post);

}
<<<<<<< HEAD
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
    
@PostMapping("/post/store")
private postThread(@RequestParam("user_id") String user_id,
                   @RequestParam("category_id") long category_id,
                   @RequestParam("post_desc") String desc){
                postService.postToDB(user_id, category_id, desc);
                
}

	return "redirect:/";
        
    
} 


>>>>>>> parent of 2081ad4 (membuat CRU pada halaman index)
=======
>>>>>>> parent of c582154 (menambahkan  table post dan category)

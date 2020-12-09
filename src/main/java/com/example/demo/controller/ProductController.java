package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

   @GetMapping("/product/{id}")
    public String show(@PathVariable int id, Model model) {
    	  Product p =productService.findById(id);
    	  System.out.println("HERE"+ id);
          model.addAttribute("product",p);
         
          return "product";
    }
    // TODO: Either implement admin controls or remove these methods.

   /* @RequestMapping(value = "/product", method = {RequestMethod.POST, RequestMethod.PUT})
    public String createOrUpdate(@Valid Product product) {
          // fill this portion in
    }*/
}


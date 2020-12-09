package com.example.demo.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
    public class ProductService {
	
        @Autowired
        private ProductRepository productRepository;
        
        public ProductService(ProductRepository p) {
        	productRepository = p;
        }
 
        public List<Product> findAll() {
              return productRepository.findAll();

		}
 
        public Product findById(long id) {
             return productRepository.findById(id);
        }
 
        public List<String> findDistinctBrands() {
              return productRepository.findDistinctBrands();
        }
 
        public List<String> findDistinctCategories() {
              return productRepository.findDistinctCategories();
        }
 
        public void save(Product product) {
        	
              productRepository.save(product);
        }
 
        public void deleteById(long id) {
             productRepository.deleteById(id);
        }
 
        public List<Product> findByBrandAndOrCategory(String brand, String category) {
             return productRepository.findByBrandAndCategory(brand, category);
        }
    }
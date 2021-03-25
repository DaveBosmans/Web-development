package com.webshop.webshop.controllers;

import com.webshop.webshop.models.ProductModel;
import com.webshop.webshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chocolaterie")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/products")
    public ResponseEntity entity(HttpServletRequest request){
        try {
            List<ProductModel>products = service.productModelList();
            return new ResponseEntity(products, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity("This productlist doesnt exist", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("products/{id}")
    public ResponseEntity entity (@PathVariable Integer id, HttpServletRequest request){
        try {
            Optional<ProductModel> product = service.singleProduct(id);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("This product doesnt exist", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

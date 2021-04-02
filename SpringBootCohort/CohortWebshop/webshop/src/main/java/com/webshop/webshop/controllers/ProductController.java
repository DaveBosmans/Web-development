package com.webshop.webshop.controllers;

import com.webshop.webshop.models.ProductModel;
import com.webshop.webshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
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
    public ResponseEntity requestProducts (HttpServletRequest request){
        try {
            List<ProductModel>products = service.productModelList();
            return new ResponseEntity(products, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity("This productlist doesn't exist", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("products/{id}")
    public ResponseEntity requestSingleProduct (@PathVariable Integer id, HttpServletRequest request){
        try {
            Optional<ProductModel> product = service.singleProduct(id);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("This product doesn't exist", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/products")
    public ResponseEntity addNewProduct(@RequestBody ProductModel newProductData){
        try{
            ProductModel newModel = service.addProduct(newProductData);
            return new ResponseEntity<>(newModel, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity("This request isn't valid", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/products/{id}")
    public ResponseEntity updateProduct(@PathVariable Integer id, @RequestBody ProductModel productData){
        try {
            service.addProduct(productData);
            return new ResponseEntity<>(productData, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("SERVER ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity deleteProduct(@PathVariable Integer id){
      try {
            service.deleteProduct(id);
            return new ResponseEntity<>(HttpStatus.OK);
      } catch (Exception e) {
          return new ResponseEntity("SERVER ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @PutMapping("/products/{id}/order")
    public ResponseEntity orderReceived(@RequestBody Integer orderedAmount, @PathVariable Integer id) {
        try{
            Optional<ProductModel> singleProduct = service.singleProduct(id);
            Integer currentStockValue = singleProduct.get().getInStock();
            Integer newStockValue = currentStockValue - orderedAmount;
            singleProduct.get().setInStock(newStockValue);
            service.addProduct(singleProduct.get());
            return new ResponseEntity<>(singleProduct.get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("SERVER ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}

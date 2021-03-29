package com.webshop.webshop.service;

import com.webshop.webshop.interfaces.ProductRepository;
import com.webshop.webshop.models.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<ProductModel> productModelList() {
        return repo.findAll();
    }

    public Optional<ProductModel> singleProduct(Integer id) {
        return repo.findById(id);
    }

    public ProductModel addProduct(ProductModel model) {
        return repo.save(model);
    }

    public void deleteProduct(Integer id) {
        repo.deleteById(id);
    }
}

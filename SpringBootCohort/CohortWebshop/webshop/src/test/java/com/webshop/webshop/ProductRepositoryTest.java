package com.webshop.webshop;


import com.webshop.webshop.interfaces.ProductRepository;
import com.webshop.webshop.models.ProductModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateProduct(){
        ProductModel product = new ProductModel();
        product.setProductName("Chocolade Haas Melk");
        product.setPrice(9.95);
        product.setProductDescription("Leuke Chocolade Lachhaas");
        product.setInStock(15);

        ProductModel savedProduct = repo.save(product);

        ProductModel existProduct = entityManager.find(ProductModel.class, savedProduct.getId());

       assertThat(existProduct.getId()).isEqualTo(product.getId());

    }
}

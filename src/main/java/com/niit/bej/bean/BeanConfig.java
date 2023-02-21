package com.niit.bej.bean;

import com.niit.bej.domain.Product;
import com.niit.bej.domain.ProductOrder;
import org.springframework.context.annotation.Bean;

public class BeanConfig {


    @Bean
    public ProductOrder printProductOrder() {
        return new ProductOrder("P01", 5, 65000);
    }

    @Bean
    public Product createProduct() {
        return new Product("A101", "Galaxy S-22", 100, "Smart Phones", printProductOrder());
    }

}

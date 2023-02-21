package com.niit.bej.bean;

import com.niit.bej.domain.Product;
import com.niit.bej.domain.ProductOrder;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Product productDetails() {
        return new Product("A101", "Samsung-Galaxy S-22", 10, "Smart-Phone");
    }

    @Bean
    public ProductOrder printProductOrder() {
        return new ProductOrder("P01", 5, 65000);
    }

}

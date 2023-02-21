package com.niit.bej.bean;

import com.niit.bej.domain.Product;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Product productDetails() {
        return new Product("A101", "Samsung-Galaxy S-22", 10, "Smart-Phone");
    }

}

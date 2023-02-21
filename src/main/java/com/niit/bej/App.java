package com.niit.bej;

import com.niit.bej.bean.BeanConfig;
import com.niit.bej.domain.ProductOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        ProductOrder order1 = applicationContext.getBean(ProductOrder.class);
        System.out.println(order1);

    }
}

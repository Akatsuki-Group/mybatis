package org.example;

import org.example.mapper.UserMapper;
import org.example.serivce.UserService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tina
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);

//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        beanDefinition.setBeanClass(UserMapper.class);
//        applicationContext.registerBeanDefinition("userService",beanDefinition);


        applicationContext.refresh();

        UserService userService = applicationContext.getBean(UserService.class);
        userService.test();
    }
}

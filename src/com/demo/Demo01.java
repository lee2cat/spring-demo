package com.demo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * ApplicationContext、XmlBeanFactory实现的基本原理：
 * 通过持有或者扩展DefaultListableBeanFactory来获得基本IOC容器的功能
 * Created by cjp on 2017/4/7.
 */
public class Demo01 {

    public static void main(String[] args) {
        //编程式使用IOC容器
        ClassPathResource classPathResource = new ClassPathResource("spring/applicationContext.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(classPathResource);
    }
}

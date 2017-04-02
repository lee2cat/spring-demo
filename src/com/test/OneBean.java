package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by cjp on 2017/3/31.
 */
public class OneBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(new String[]{
                "src/spring/applicationContext.xml"
        });

        System.out.println(applicationContext.getBean("oneBean"));
    }
}

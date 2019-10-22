package com.scx.spring.class006;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class006Test {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean" ,Bean.class);
        System.out.println("bean = " + bean);
        System.out.println("getAnotherBeanList = " + bean.getAnotherBeanList());
        System.out.println("getAnotherBeanMap = " + bean.getAnotherBeanMap());
        System.out.println("getAnotherBeanSet = " + bean.getAnotherBeanSet());
        System.out.println("getStringList = " + bean.getStringList());
        System.out.println("getStringMap = " + bean.getStringMap());
        System.out.println("getStringSet = " + bean.getStringSet());
        System.out.println("getProperties = " + bean.getProperties());
        System.out.println("getAnotherBean2 = " + bean.getAnotherBean2());
    }
}

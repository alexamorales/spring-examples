package com.lisun.spring;

import com.lisun.spring.beans.FirstBean;
import com.lisun.spring.beans.FirstComponent;
import com.lisun.spring.beans.Quoter;
import com.lisun.spring.configurable.MyFirstConfigurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(new String[]{"classpath*:/META-INF/spring/*-context.xml"});

//        ApplicationContext ctx = new AnnotationConfigApplicationContext(FirstConfiguration.class);


//        FirstBean firstBean = (FirstBean) ctx.getBean("firstBean");
//        firstBean.showParameter();
//
//        SimpleContainer simpleContainer = (SimpleContainer) ctx.getBean("dupa");
//
//        System.out.format("The name of container %s\n", simpleContainer.getName());

//        System.out.println("Let's inspect the beans provided:");
//
//        for (String beanName : ctx.getBeanDefinitionNames()) {
//            System.out.println(beanName + "\n");
//        }

        Quoter terminatorQuoter = (Quoter) ctx.getBean("terminatorQuoter");
        terminatorQuoter.sayQuote();

        FirstComponent firstComponent = (FirstComponent) ctx.getBean("firstComponent");
        firstComponent.setString("Yo!");
        System.out.println(firstComponent.getString());


        MyFirstConfigurable myFirstConfigurable = new MyFirstConfigurable();
        myFirstConfigurable.saySmthing();
    }
}

package com.lisun.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alekseylisun.
 *
 * @since 28.01.16
 */
@Component
public class SecondBean {

    private final FirstBean firstBean;

    private String name;

    @Autowired
    public SecondBean(FirstBean firstBean) {
        this.firstBean = firstBean;
    }

    public void name() {
        System.out.println("Name: " + name + "First bean: " + firstBean.getValue());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

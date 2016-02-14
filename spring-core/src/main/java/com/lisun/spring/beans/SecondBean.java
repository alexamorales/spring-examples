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

    @Autowired
    private FirstBean firstBean;

    private String name;

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

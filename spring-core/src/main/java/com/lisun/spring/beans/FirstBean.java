package com.lisun.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by alekseylisun.
 *
 * @since 27.01.16
 */
public class FirstBean {

    @Value("${first.value}")
    private String value;

    private String parameter;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public void showParameter() {
        System.out.println(parameter + "\n" + value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

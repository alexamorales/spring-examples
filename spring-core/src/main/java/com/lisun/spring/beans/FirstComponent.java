package com.lisun.spring.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by alekseylisun.
 *
 * @since 04.02.16
 */
@Component
public class FirstComponent {

    private String string;

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}

package com.lisun.spring.configurable;

import com.lisun.spring.beans.FirstBean;
import com.lisun.spring.beans.Quoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * Created by alekseylisun.
 *
 * @since 02.02.16
 */
@Configurable
public class MyFirstConfigurable {

    private final FirstBean quoter;

    @Autowired
    public MyFirstConfigurable(FirstBean quoter) {
        this.quoter = quoter;
    }

    public void saySmthing() {
        quoter.showParameter();
    }
}

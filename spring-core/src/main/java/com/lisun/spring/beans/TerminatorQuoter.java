package com.lisun.spring.beans;

import com.lisun.spring.annotations.MyTransactional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by alekseylisun.
 *
 * @since 31.01.16
 */

@MyTransactional
public class TerminatorQuoter implements Quoter {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}

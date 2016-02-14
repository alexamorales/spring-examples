package com.lisun.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by alekseylisun.
 *
 * @since 31.01.16
 */

@Aspect
public class MyFirstAspect {
    @Pointcut("execution(* com..*.say*(..))")
    public void allQuoterMethods() {

    }

    @Before("allQuoterMethods()")
    public void quoteAspect() {
        System.out.println("this is quote: ");
    }
}

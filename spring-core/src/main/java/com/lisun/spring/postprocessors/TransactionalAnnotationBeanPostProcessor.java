package com.lisun.spring.postprocessors;

import com.lisun.spring.annotations.MyTransactional;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alekseylisun.
 *
 * @since 31.01.16
 */
public class TransactionalAnnotationBeanPostProcessor implements BeanPostProcessor {

    private Map<String, Class<?>> beanNames = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        if (beanClass.isAnnotationPresent(MyTransactional.class)) {
            beanNames.put(beanName, beanClass);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        Class<?> beanClass = beanNames.get(beanName);
        if (beanClass != null) {
            return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), beanClass.getInterfaces(), (proxy, method, args) -> {
                System.out.println("TRANSACTION OPENED");
                Object retVal = method.invoke(bean, args);
                System.out.println("TRANSACTION CLOSED");
                return retVal;
            });
        }

        return bean;
    }
}

package com.lisun.spring.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;

import static org.springframework.util.ReflectionUtils.invokeMethod;

/**
 * Created by alekseylisun.
 *
 * @since 31.01.16
 */
public class PostConstructInterfaceResolverBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?>[] interfaces = bean.getClass().getInterfaces();

        for (Class<?> anInterface : interfaces) {
            Method[] declaredMethods = anInterface.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                if (declaredMethod.isAnnotationPresent(PostConstruct.class)) {
                    invokeMethod(declaredMethod, bean);
                }
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }


    @Override
    public int getOrder() {
        return LOWEST_PRECEDENCE;
    }
}

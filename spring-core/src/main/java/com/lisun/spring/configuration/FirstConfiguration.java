package com.lisun.spring.configuration;

import com.lisun.spring.beans.FirstBean;
import com.lisun.spring.beans.SecondBean;
import com.lisun.spring.beans.SimpleContainer;
import com.lisun.spring.beans.TerminatorQuoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by alekseylisun.
 *
 * @since 28.01.16
 */
@Configuration
@PropertySource("classpath:module-config/first.properties")
public class FirstConfiguration {

    @Value("${name}")
    private String name;

    @Autowired
    private Environment environment;

    @Bean
    public FirstBean firstBean() {
        FirstBean firstBean = new FirstBean();
        return firstBean;
    }

    @Bean(name = "secondBean", initMethod = "name")
    public SecondBean getSecondBean() {
        SecondBean secondBean = new SecondBean(firstBean());
        secondBean.setName("Nick");

        System.out.println("From environment: " + environment.getProperty("name"));

        return secondBean;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "dupa")
    public SimpleContainer simpleContainer() {
        return new SimpleContainer.Builder()
                .withAge(2)
                .withName("Builder")
                .withSex("M")
                .build();
    }

    @Bean
    public TerminatorQuoter terminatorQuoter() {
        TerminatorQuoter terminatorQuoter = new TerminatorQuoter();
        terminatorQuoter.setMessage("I`ll be back");
        return terminatorQuoter;
    }


}

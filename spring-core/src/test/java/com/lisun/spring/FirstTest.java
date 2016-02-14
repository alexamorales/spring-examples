package com.lisun.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by alekseylisun.
 *
 * @since 27.01.16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath*:META-INF/*-context.xml",

})
public class FirstTest {

    @Test
    public void shouldTestConfig() {
        Assert.assertTrue(true);
    }
}

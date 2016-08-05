package com.cc.dubbo.provider.impl;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cc.test.BaseTest;

/**
 * 
 * @since 1.0.0
 * @version $Id$
 */
public class DemoServiceImplTest extends BaseTest{

    @Test
    public void testStartProvider() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "application.xml" });  
        context.start();  
        System.in.read(); 
    }
}

package com.cc.dubbo.provider.impl;

import java.util.ArrayList;
import java.util.List;

import com.cc.dubbo.provider.DemoService;

/**
 * 
 * @since 1.0.0
 * @version $Id$
 */
public class DemoServiceImpl implements DemoService {

    /**
     * {@inheritDoc}
     */
    public String sayHello(String name) {
        return "hello "+name;
    }

    /**
     * {@inheritDoc}
     */
    public List getUsers() {
        List<String> users = new ArrayList<String>();
        users.add("cc");
        users.add("aa");
        users.add("bb");
        return users;
    }
    
}

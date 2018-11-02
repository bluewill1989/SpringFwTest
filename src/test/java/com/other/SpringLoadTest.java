package com.other;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * DESCRIPTION:
 * spring的启动测试
 *
 * @author will
 * @create 2018-10-31 13:59
 */
@ContextConfiguration("/application-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringLoadTest {

    @Autowired
    ModelA modelA;

    @Test
    public void modelATest(){
        modelA.println();
    }


}
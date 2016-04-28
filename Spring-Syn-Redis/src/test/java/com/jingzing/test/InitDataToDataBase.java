package com.jingzing.test;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Louis Wang on 2016/4/28.
 * 初始化网站数据到数据库
 */

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-context.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@TestExecutionListeners(listeners = { DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class })
public class InitDataToDataBase {
    @Autowired
    private SessionFactory sessionFactory;

    // 存放url 和title
    public ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap();

    @Test
    @Transactional
    public void test() throws IOException {
        final Session session = sessionFactory.getCurrentSession();
        ExecutorService pool = Executors.newFixedThreadPool(10);
    }
}

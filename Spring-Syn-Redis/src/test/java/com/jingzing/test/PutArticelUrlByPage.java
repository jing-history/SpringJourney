package com.jingzing.test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Louis Wang on 2016/5/17.
 */

public class PutArticelUrlByPage implements Runnable {
    public static final String BEGIN_URL = "http://www.tuicool.com/articles/";
    // 推酷上面的 科技和数码栏目 pageNumber 0到20
    // http://www.tuicool.com/ah/0/20?lang=0//科技
    // http://www.tuicool.com/ah/101050000/20?lang=0//数码
    public static final String BEGIN_KJ_URL = "http://www.tuicool.com/ah/0/pageNumber?lang=0";
    public static final String BEGIN_SM_URL = "http://www.tuicool.com/ah/101050000/pageNumber?lang=0";

    public PutArticelUrlByPage(ConcurrentHashMap<String, String> currentHashMap, int i) {
    }

    public void run() {

    }
}

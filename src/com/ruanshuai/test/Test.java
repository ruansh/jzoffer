package com.ruanshuai.test;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ruanshuai
 * @date 2020/9/5
 */

public class Test extends Thread {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new Hashtable<>();
        Map<String, String> map3 = new ConcurrentHashMap<>();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        String str = "abc";


    }
}

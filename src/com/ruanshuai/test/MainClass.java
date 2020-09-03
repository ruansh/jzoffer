package com.ruanshuai.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author ruanshuai
 * @date 2020/8/28
 */

public class MainClass {

    public static void main(String[] args) {
        try {
            Class a = TestClass.class;
            Object b = a.newInstance();
            Field field = a.getDeclaredField("b");
            Method method = a.getDeclaredMethod("func", String.class);
//            System.out.println(field);
//            System.out.println(method);
            Object o = a.getDeclaredMethod("func", String.class);
            System.out.println(method.invoke(b, "hello"));
//            Thread
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

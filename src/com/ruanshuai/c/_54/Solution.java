package com.ruanshuai.c._54;

import java.util.*;

/**
 * @author ruanshuai
 * @date 2020/7/26
 */

public class Solution {

    List<Character> list = new ArrayList<>();

    //Insert one char from stringstream
    public void Insert(char ch) {
        list.add(ch);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (int i = 0; i < list.size(); i++) {
            char temp = list.get(i);
            if (list.indexOf(temp) == list.lastIndexOf(temp))
                return temp;
        }
        return '#';
    }
}
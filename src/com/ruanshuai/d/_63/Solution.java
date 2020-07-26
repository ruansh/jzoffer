package com.ruanshuai.d._63;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/7/26
 */

public class Solution {

    List<Integer> list = new ArrayList<>();

    public void Insert(Integer num) {
        if (list.size() == 0) {
            list.add(num);
            return;
        }
        if (num < list.get(0)) {
            list.add(0, num);
            return;
        }
        if (num > list.get(list.size() - 1)) {
            list.add(num);
            return;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < num && list.get(i + 1) > num)
                list.add(i + 1, num);
        }
    }

    public Double GetMedian() {
        if (list == null || list.size() == 0)
            return 0d;
        int length = list.size();
        if (length % 2 != 0)
            return (double) list.get(length / 2);
        else
            return (list.get(length / 2) + list.get(length / 2 - 1)) / 2.0;
    }

}
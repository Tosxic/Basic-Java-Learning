package com.tosxic.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/*
* Set接口下有HashSet\LinkedHashSet\TreeSet实现
* Set元素唯一
* HashSet不保证任何顺序
* LinkedHashSet保证插入顺序
* TreeSet有序,只能存储一种固定类型
* */
public class SetTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Tom");
        hs.add("Jerry");
        hs.add("Tom");
        hs.add(123);
        System.out.println(hs);

        HashSet lhs = new LinkedHashSet();
        lhs.add("Tom");
        lhs.add("Jerry");
        lhs.add("Tom");
        lhs.add(123);
        System.out.println(lhs);

        TreeSet<Integer> ts = new TreeSet();
        ts.add(20);
        ts.add(20);
        ts.add(50);
        ts.add(1);
        System.out.println(ts);
    }
}

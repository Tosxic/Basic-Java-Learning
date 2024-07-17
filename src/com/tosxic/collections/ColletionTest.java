package com.tosxic.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
* Collection是一个接口，List接口继承Collection，常用子类实现有ArrayList和LinkedList
* ArrayList内部是数组
* LinkedList内部是链表
* */
public class ColletionTest {
    public static void main(String[] args) {
        /*
        * 定义及添加
        * */
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add(new String("def"));
        coll.add(123);
        System.out.println(coll);

        Collection newColl = new ArrayList();
        newColl.add("abc");
        newColl.addAll(coll);
        System.out.println(newColl);

        /*
        * 删除
        * */
        newColl.remove("abc");
        System.out.println(newColl);

        newColl.clear();
        System.out.println(newColl);

        /*
        * 判断是否包含
        * */
        newColl.addAll(coll);
        boolean isContained = newColl.contains(123);
        System.out.println(isContained);

        /*
        * 取交集
        * */
        newColl.remove("abc");
        newColl.add("rt");
        boolean changed = newColl.retainAll(coll);
        System.out.println(newColl + " " + changed);
    }
}

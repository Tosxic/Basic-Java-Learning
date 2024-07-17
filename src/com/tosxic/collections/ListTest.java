package com.tosxic.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Tom");
        list.add("Jerry");
        list.add(123);
        System.out.println(list);

        /*
        * 下标获取
        * */
        Object getObj = list.get(1);
        System.out.println(getObj);

        /*
        * 下标添加
        * */
        list.add(0, "tosxic");
        System.out.println(list);

        /*
        * 下标删除
        * */
        Object remObj = list.remove(2);
        System.out.println(remObj);
        System.out.println(list);

        /*
        * 下标修改
        * */
        Object setObj = list.set(1, "Nike");
        System.out.println(setObj);
        System.out.println(list);

        /*
        * 子列表
        * */
        List subList = list.subList(0, 2);
        System.out.println(subList);

        /*
        * for遍历、forEach、Iterator遍历
        * */
        System.out.println("for遍历");
        for(int i = 0; i < list.size(); ++i) {
            System.out.println("index:" + i + "  " + "element:" + list.get(i));
        }
        System.out.println("forEach遍历");
        for(Object obj : list) {
            System.out.println("element:" + obj);
        }
        System.out.println("Iterator遍历");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("element:" + obj);
        }
    }
}

package com.tosxic.collections;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Tom");
        list.add("Jerry");
        list.add("Tyke");
        System.out.println(list);

        /*
        * 添加元素
        * add/offer区别,offer直接调用add,并有返回值
        * */
        list.addFirst("add-first");
        list.addLast("add-last");
        list.offerFirst("offer-first");
        list.offerLast("offer-last");
        System.out.println(list);

        /*
        * 获取元素
        * */
        Object getFirst = list.getFirst();
        Object getLast = list.getLast();
        System.out.println(getFirst + " " + getLast);
        Object peekFirst = list.peekFirst();
        Object peekLast = list.peekLast();
        System.out.println(peekFirst + " " + peekLast);

        /*
        * 移除元素
        * */
        Object removeFirst = list.removeFirst();
        Object removeLast = list.removeLast();
        System.out.println(removeFirst + " " + removeLast + " " + list);
        Object pollFirst = list.pollFirst();
        Object pollLast = list.pollLast();
        System.out.println(pollFirst + " " + pollLast + " " + list);
    }
}

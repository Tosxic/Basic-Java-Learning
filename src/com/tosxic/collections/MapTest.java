package com.tosxic.collections;

import java.util.*;

/*
* map接口下有HashMap和TreeMap两种常用子类实现
* HashMap不保证顺序
* TreeMap保证键值顺序
* */
public class MapTest {

    public static void getAllMethod1(Map map) {
        System.out.println("---method1---");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while(it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }

    public static void getAllMethod2(Map map) {
        System.out.println("---method2---");
        Set<Map.Entry<Object, Object>> entrySet = map.entrySet();
        Iterator<Map.Entry<Object, Object>> it = entrySet.iterator();
        while(it.hasNext()) {
            Map.Entry<Object, Object> me = it.next();
            System.out.println(me.getKey() + ":" + me.getValue());
        }
    }

    public static void getAllMethod3(Map map) {
        System.out.println("---method3---");
        Collection<Object> values = map.values();
        Iterator<Object> it = values.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        /*
        * put方法返回值在key的value替换时，返回被替换掉的value值
        * */
        Object putOne = map.put("one", 111);
        Object putTwo = map.put("two", 222);
        Object putThree = map.put("one", 333);
        Object put123 = map.put(123, "123");
        Object putFour = map.put("four", 222);
        System.out.println(putOne + " " + putTwo + " " + putThree);
        System.out.println(map);

        /*
        * 判key和value是否存在
        * */
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(222));
        System.out.println(map.containsValue("111"));

        /*
        * 获取元素
        * */
        Object objVal = map.get("one");
        System.out.println(objVal);

        /*
        * 元素个数
        * */
        System.out.println(map.size());

        /*
        * 遍历map
        * */
        getAllMethod1(map);
        getAllMethod2(map);
        getAllMethod3(map);
    }
}

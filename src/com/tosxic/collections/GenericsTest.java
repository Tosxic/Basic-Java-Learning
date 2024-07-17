package com.tosxic.collections;

/*
* 在类上定义泛型
* T\E\K\V常用于定义泛型
* */
public class GenericsTest<T> {
    private T data;
    public GenericsTest() {

    }

    public GenericsTest(T data) {
        this.data = data;
    }

    /*
    * 泛型方法,可以引入一个新的类型参数
    * */
    public <E> void setData(E e) {
        this.data = (T) e.toString();
    }

    public T getData() {
        return data;
    }
}

class Test {
    public static void main(String[] args) {
        GenericsTest<Integer> num = new GenericsTest<Integer>(1);
        System.out.println(num.getData());
        GenericsTest<String> str = new GenericsTest<String>("hey");
        /*
        * 编译时类型擦除,GenericsTest<String> 和 GenericsTest<Integer>
        * 都被擦除成了 GenericsTest
        * */
        System.out.println(str.getClass() == num.getClass());

        str.setData(123);

        GenericsTest<Number> num1 = new GenericsTest<Number>(45);
        GenericsTest<Integer> num2 = new GenericsTest<Integer>(11);

        getData(num1);
        getData(num2);
        getData(str);

        getUpperNumberData(num1);
        getUpperNumberData(num2);
//        getNumberData(str);

        getLowerNumberData(num1);
//        getLowerNumberData(num2);
    }

    /*
    * 类型通配符
    * */
    public static void getData(GenericsTest<?> data) {
        System.out.println(data.getData());
    }
    /*
    * 设置通配符的上限范围
    * */
    public static void getUpperNumberData(GenericsTest<? extends Number> data) {
        System.out.println(data.getData());
    }
    /*
     * 设置通配符的下限范围
     * */
    public static void getLowerNumberData(GenericsTest<? super Number> data) {
        System.out.println(data.getData());
    }
}
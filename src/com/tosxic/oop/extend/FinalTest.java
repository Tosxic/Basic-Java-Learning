package com.tosxic.oop.extend;

/*
* final修饰类无法被继承
* */
public final class FinalTest {

}

class Father {
    public final void print() {
        System.out.println("Hey");
    }
}

class Son extends Father {
    /*
    * final修饰方法无法被重写
    * */
//    public void print() {
//        System.out.println("Hi");
//    }
}

class MyClass {
    /*
    * final修饰成员变量初始化后不能被修改, 且在声明时初始化
    * */
    public final int finalField = 10;

    /*
    * final修饰参数, 参数无法修改
    * */
    public void change(final int value) {
//        value = 10;
    }

    /*
    * final修饰引用类型, 可以修改内容, 但无法修改引用
    * */
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("Initial");
        sb.append(" content.");
//        sb = new StringBuffer("New reference");
    }
}

package com.tosxic.oop.polymorphism;

public class AnimalTest {
    /*
    * 多态条件
    * 1.继承
    * 2.重写
    * 3.父类引用指向子类对象
    * */
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal = new Dog();
        animal.eat();

        /*
        * 父类引用指向子类对象, 无法使用子类新加方法, 但是向下转型后可以
        * */
        Dog dog = new Husky();      // 向上转型
//        dog.bark();
        if(dog instanceof Husky) {
            Husky husky = (Husky) dog;  // 向下转型
            husky.eat();
            husky.bark();
        }
    }
}

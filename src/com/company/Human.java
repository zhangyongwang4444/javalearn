package com.company;

public class Human {
    private static int number = 0;

    // 成员变量
    // final 成员变量必须直接在声名的时候就初始化，或者在构造函数里面初始化！！！
    private final String name;
    private int weight;

    // 目的是初始化对象

    // 构造方法1
    public Human() {
        // 当前对象
        this.name = "default";
        this.weight = 100;
        Human.number += 1;
    }

    // 构造方法2
    public Human(String name, int weight) {
        this.name = name;
        this.weight = weight;
        Human.number += 1;
    }

    // 静态方法里构造对象
    public static Human newHuman(String name, int weight) {
        return new Human(name, weight);
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    // 锻炼减肥
    public int workout() {
        weight = weight - 5;
        return weight;
    }

    public static int getNumber() {
        return number;
    }

    // 只读，因为没有setter方法
    public int getNumber(int test) {
        return 0;
    }
}
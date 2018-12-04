package com.company;

public class Main {
    public static void main(String[] args) {
        Human def = new Human();
        System.out.print(def.getName());
        System.out.print(def.getWeight());

        System.out.println(Human.getNumber());
        System.out.println(Human.getNumber());

        Human jeff = new Human("jeff", 120);
        System.out.print(jeff.getName());
        System.out.print(jeff.getWeight());

        Human jimmy = Human.newHuman("jimmy", 150);
        jeff.setName("David");
        Human david = jeff; // jeff -> Human("David",120) , david -> Human("David",120)

        int newWeight = david.workout(); // int newWeight = jeff.workout()

        System.out.println(david.getName());
        System.out.println(jeff.getWeight());

        // i++ == i = i + 1 == i+=1
        // ++i
        // a = i++
        // a =++i
        for (int i = 1; i < 10; i = i * 2) {
            int test = jeff.workout();

        }
        // while loop
        int i = 1;
        while (i < 10) {
            jeff.workout();
            i += 1;
        }
        System.out.println(jeff.getWeight());
    }
}

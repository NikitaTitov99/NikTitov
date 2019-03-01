package com.company;

public class Main {

    public static void main(String[] args) throws AreaExeption, LightExeption {

        Building b1 = new Building("Здание №1");
        System.out.println(b1.getBuilderName());
        b1.addRoom(" Помещение №1", 10, 1,1,1,1);
        b1.addRoom(" Помещение №2", 100, 15,1,15,10);

        Building b2 = new Building("Здание №2");
        System.out.println(b2.getBuilderName());
        b2.addRoom(" Помещение №1", 10, 1,1,1,1);
        b2.addRoom(" Помещение №2", 50, 7,4,3,4);
    }
}

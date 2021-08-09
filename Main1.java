package com.company;

import java.util.Arrays;

public class Main1{
    private String mvg="Hello everyone!!!";

    public static void main(String[] args){
        Main1 object1=new Main1();
        Main1 object2=new Main1().new Inner();
        Main1.Inner object3=new Main1().new Inner();


        object1.foo();
        object2.foo();
        object3.foo();



        Child obj=new Child();
        obj.foo();

    }



    class  Inner extends Main1{
        private String mvg="Hello from Inner!";
        private void foo(){
            System.out.println("Foo from Inner "+ mvg);
        }
    }

    private void foo(){
        System.out.println("Foo from Outer "+mvg);
    }


}
class Child extends Main1{
    private int mvg=1000;
     void foo(){
        System.out.println("FRrom another child class"+mvg);
    }
}
//protected class ajndjn{
//
//}
// interface Mnajndjan{
//    public  static void ghj(){
//
//    }
//}
//abstract class MyVanxdka{
//
//}

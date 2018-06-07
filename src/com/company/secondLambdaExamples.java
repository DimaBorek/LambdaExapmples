package com.company;

import static javafx.scene.input.KeyCode.T;

public class secondLambdaExamples {
    static int x = 10;static int y = 20;
   /* interface Operation{
        int calculate();
    }
    private static void m1(){
        Operation op = ()->{
            x =30;
            return x+y;
        };
        System.out.println(op.calculate());
        System.out.println(x);

    }
private static void m2(){
        int n = 70;
        int m = 30;
        Operation op1 = ()->{
            //n=100;
            return m+n;
        };
        //n = 100;
    System.out.println(op1.calculate());

}*/
interface OperationableGeneric<T>{
    T calculate(T x,T y);
}
private static void m3(){


    OperationableGeneric<Integer> op1 =(x,y)->x+y;
    OperationableGeneric<String> op2 = (x,y)->x+y;
    System.out.println(op1.calculate(10,20));
    System.out.println(op2.calculate("10","20"));
 }



    public static void main(String[] args) {
        //m1();
       // m2();
//m3();
    }
}

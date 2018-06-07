package com.company;

import com.sun.javafx.css.CalculatedValue;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.security.cert.X509Certificate;

public class Main {
    interface Operationable{
        int calculate(int x,int y);
    }

    public static void m1() {
        Operationable operationableAnon = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int resultAnon = operationableAnon.calculate(10, 20);
        System.out.println(resultAnon);


        Operationable operation1 = (x, y) -> x * y;
        Operationable operation2 = (x, y) -> x - y;
        System.out.println(operation1.calculate(10,20));
        System.out.println(operation1.calculate(10,20));
    }
    public static void main(String[] args) {
        m1();
    }
}

package com.company;

import java.beans.Expression;
import java.security.PrivateKey;

public class LamdaThree {
    interface Expression{
        boolean isEgual(int n);
    }
    private static void m1() {
        Expression fune = (n) -> n%2 == 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(nums, fune));
    }
    private static int sum(int[] numbers,Expression fune){
        int result = 0;
        for (int i:numbers) {
            if(fune.isEgual(i)){
                result+=i;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        m1();
    }
}

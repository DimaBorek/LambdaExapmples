package com.company;

public class LambdaFour {
    interface UserBuilder{
        User create(String name);
    }


    public static void main(String[] args) {
        UserBuilder userB = User::new;
        User user = userB.create("Tom");
        System.out.println(user.getName());
    }
}


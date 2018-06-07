package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSix {
    public static void main(String[] args, Object name) {
        List<String> strings = new ArrayList<>();
        strings.add("Ivan");
        strings.add("not Name");
        strings.add("null");
        strings.add("Stepan");
        strings.add("blabla");
        List<User> users = new ArrayList<>();
       List<String>userNames = new ArrayList<>();
        for(String name:strings){
            if(name !=null && !name.contains("")&& Character.isUpperCase(name.charAt(0))){
                userNames.add(name);

            }
        }
        Collections.sort(userNames);
        for(String name:userNames){
            User user = new User(name);
            users.add(user);
            System.out.println(userNames);
        }
        List<User> userslambda = strings.stream().filter(((name != null) && !name.contains("") && Character.isUpperCase(name.charAt(0))).sorted().map(User::new).collect(Collectors.toList());

        }

    }
}

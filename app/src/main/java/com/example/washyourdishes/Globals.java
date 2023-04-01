package com.example.washyourdishes;

import com.example.washyourdishes.objects.Resource;
import com.example.washyourdishes.objects.Rule;
import com.example.washyourdishes.objects.User;

import java.util.ArrayList;
import java.util.List;

public class Globals {
    public static ArrayList<User> users = new ArrayList<User>();
    public static List<Rule> rulesList = new ArrayList<>();
    public static List<Resource> resourcesList = new ArrayList<>();

    public static void fillUsers(){
        users.add(new User(1, "Piotr", R.drawable.piotr));
        users.add(new User(2, "Krzysiek", R.drawable.krzys));
        users.add(new User(3, "Wojtek", R.drawable.wojtek));
        users.add(new User(4, "Kuba", R.drawable.kuba));
    }

    public static void fillrulesList(){
        rulesList.add(new Rule("Dish", -3));
        rulesList.add(new Rule("Fork", -1));
        rulesList.add(new Rule("Clean Floor", 5));
        rulesList.add(new Rule("Take out trash", 3));
        rulesList.add(new Rule("Clean windows", 8));
        rulesList.add(new Rule("Floor", 5));
    }

    public static void fillResources(){
        resourcesList.add(new Resource("Soap dish", "low"));
        resourcesList.add(new Resource("Paper", "normal"));
    }
}

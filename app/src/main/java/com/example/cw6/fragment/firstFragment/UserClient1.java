package com.example.cw6.fragment.firstFragment;

import java.util.ArrayList;

public class UserClient1 {
    public static ArrayList<UserModel1> list = new ArrayList<>();

    public static ArrayList<UserModel1> getUserData() {
        list.add(new UserModel1("Филипп"));
        list.add(new UserModel1("Греб"));
        list.add(new UserModel1("Игорь"));
        list.add(new UserModel1("Иван"));
        list.add(new UserModel1("Евгений"));
        return list;
    }
}

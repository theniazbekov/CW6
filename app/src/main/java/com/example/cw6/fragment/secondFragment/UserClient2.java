package com.example.cw6.fragment.secondFragment;

import android.widget.ImageView;

import java.util.ArrayList;

public class UserClient2 {
    public UserClient2(String s, ImageView imageView) {
    }

    public static ArrayList<UserModel2> list = new ArrayList<>();

    public static ArrayList<UserModel2> getUserData() {
        list.add(new UserModel2("31"));
        list.add(new UserModel2("23"));
        list.add(new UserModel2("41"));
        list.add(new UserModel2("33"));
        list.add(new UserModel2("17"));
        return list;
    }
}

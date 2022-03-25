package com.example.cw6.fragment.secondFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.AppBarConfiguration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cw6.R;
import com.example.cw6.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private ArrayList<UserModel2> age;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);

        return (binding.getRoot());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setData();
    }

    @Override
    public void onStop() {
        super.onStop();
        age.clear();
    }


    private void setData() {
        age = UserClient2.getUserData();
        UserAdapter2 adapter = new UserAdapter2(age);
        binding.recycler.setAdapter(adapter);
        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(R.id.fragment_first, R.id.fragment_second).build();
    }
}
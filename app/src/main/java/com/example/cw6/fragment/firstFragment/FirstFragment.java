package com.example.cw6.fragment.firstFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.cw6.R;
import com.example.cw6.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    private ArrayList<UserModel1> firstNames;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
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
        firstNames.clear();
    }


    private void setData() {
        firstNames = UserClient1.getUserData();
        UserAdapter1 adapter = new UserAdapter1(firstNames);
        binding.recycler.setAdapter(adapter);
    }
}
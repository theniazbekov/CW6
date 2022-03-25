package com.example.cw6.fragment.commonFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cw6.databinding.FragmentCommonBinding;
import com.example.cw6.fragment.firstFragment.UserAdapter1;
import com.example.cw6.fragment.firstFragment.UserClient1;
import com.example.cw6.fragment.firstFragment.UserModel1;
import com.example.cw6.fragment.secondFragment.UserAdapter2;
import com.example.cw6.fragment.secondFragment.UserClient2;
import com.example.cw6.fragment.secondFragment.UserModel2;

import java.util.ArrayList;


public class CommonFragment extends Fragment {
    private @NonNull FragmentCommonBinding binding;
    private ArrayList<UserModel1> firstNames;
    private ArrayList<UserModel2> age;
    private UserAdapter1 adapterFirstFragment;
    private UserAdapter2 adapterSecondFragment;
    private ConcatAdapter concatAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCommonBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setData();
    }


    private void setData() {
        RecyclerView recyclerView = binding.recyclerView;
        firstNames = UserClient1.getUserData();
        age = UserClient2.getUserData();
        adapterFirstFragment = new UserAdapter1(firstNames);
        adapterSecondFragment = new UserAdapter2(age);
        concatAdapter = new ConcatAdapter(adapterFirstFragment, adapterSecondFragment);
        recyclerView.setAdapter(concatAdapter);

    }

    @Override
    public void onStop() {
        super.onStop();
        firstNames.clear();
        age.clear();
    }

}
package com.example.cw6.fragment.secondFragment;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cw6.databinding.ListHolderOneBinding;

import java.util.ArrayList;

public class UserAdapter2 extends RecyclerView.Adapter<UserAdapter2.Holder> {

    private ArrayList<UserModel2> family = new ArrayList<>();

    public UserAdapter2(ArrayList<UserModel2> family) {
        this.family = family;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(ListHolderOneBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.onBind(family.get(position));
    }

    @Override
    public int getItemCount() {
        return family.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ListHolderOneBinding binding;

        public Holder(@NonNull ListHolderOneBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(UserModel2 UserModel2) {
            binding.tvName.setText(UserModel2.getAge());

        }

    }
}

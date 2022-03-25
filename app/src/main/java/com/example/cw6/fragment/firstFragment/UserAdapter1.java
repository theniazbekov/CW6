package com.example.cw6.fragment.firstFragment;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cw6.databinding.ListHolderOneBinding;

import java.util.ArrayList;

public class UserAdapter1 extends RecyclerView.Adapter<UserAdapter1.Holder> {

    private ArrayList<UserModel1> firstNames = new ArrayList<>();

    public UserAdapter1(ArrayList<UserModel1> firstNames) {
        this.firstNames = firstNames;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(ListHolderOneBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.onBind(firstNames.get(position));
    }

    @Override
    public int getItemCount() {
        return firstNames.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ListHolderOneBinding binding;

        public Holder(@NonNull ListHolderOneBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(UserModel1 UserModel1) {
            binding.tvName.setText(UserModel1.getName());

        }

    }
}

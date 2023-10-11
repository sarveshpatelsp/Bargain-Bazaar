package com.example.bargainbazaar.ui.myorder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.bargainbazaar.databinding.FragmentMyOrderBinding;

public class MyOrderFragment extends Fragment {

    private FragmentMyOrderBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MyOrderViewModel myOrderViewModel =
                new ViewModelProvider(this).get(MyOrderViewModel.class);

        binding = FragmentMyOrderBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMyOrder;
        myOrderViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
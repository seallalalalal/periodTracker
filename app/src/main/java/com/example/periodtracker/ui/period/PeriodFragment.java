package com.example.periodtracker.ui.period;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.periodtracker.databinding.FragmentPeriodBinding;
import com.example.periodtracker.databinding.FragmentPeriodBinding;

public class PeriodFragment extends Fragment {

    private FragmentPeriodBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PeriodViewModel periodViewModel =
                new ViewModelProvider(this).get(PeriodViewModel.class);

        binding = FragmentPeriodBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPeriod;
        periodViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
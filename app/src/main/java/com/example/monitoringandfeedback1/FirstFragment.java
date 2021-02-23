package com.example.monitoringandfeedback1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        v.findViewById(R.id.button).setOnClickListener(view -> {
            ((ChangeFragment) getActivity()).changeFragment(ChangeFragment.FRAGMENT.SECOND);
        });
        return v;
    }
}

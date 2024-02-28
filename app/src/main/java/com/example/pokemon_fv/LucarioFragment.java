package com.example.pokemon_fv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pokemon_fv.databinding.FragmentLucarioBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class LucarioFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentLucarioBinding binding;
    private String mParam1;
    private String mParam2;

    public LucarioFragment() {
        // Required empty public constructor
    }

    public static LucarioFragment newInstance(String param1, String param2) {
        LucarioFragment fragment = new LucarioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLucarioBinding.inflate(inflater, container, false);

        View root = binding.getRoot();


        TextView back = root.findViewById(R.id.lucarioFragmentText);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back
                requireActivity().onBackPressed();
            }
        });

        return root;
    }
}
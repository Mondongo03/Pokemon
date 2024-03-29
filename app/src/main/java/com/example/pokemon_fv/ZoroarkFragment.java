package com.example.pokemon_fv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.pokemon_fv.databinding.FragmentLucarioBinding;
import com.example.pokemon_fv.databinding.FragmentZoroarkBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ZoroarkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ZoroarkFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters

    private FragmentZoroarkBinding binding;

    private String mParam1;
    private String mParam2;

    public ZoroarkFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ZoroarkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ZoroarkFragment newInstance(String param1, String param2) {
        ZoroarkFragment fragment = new ZoroarkFragment();
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
        binding = FragmentZoroarkBinding.inflate(inflater, container, false);

        View root = binding.getRoot();
        BottomNavigationView navView = requireActivity().findViewById(R.id.nav_view);
        navView.setVisibility(View.GONE);

        ImageView back = root.findViewById(R.id.back);

        ImageView imageView = root.findViewById(R.id.gifzoroark);

// Cargar y mostrar un GIF desde una URL
        Glide.with(this).asGif().load(R.drawable.zoroark_gif).into(imageView);

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
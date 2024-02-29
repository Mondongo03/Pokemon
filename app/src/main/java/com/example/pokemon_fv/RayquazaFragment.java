package com.example.pokemon_fv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import com.bumptech.glide.Glide;

import com.example.pokemon_fv.databinding.FragmentLucarioBinding;
import com.example.pokemon_fv.databinding.FragmentRayquazaBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RayquazaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RayquazaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters

    private FragmentRayquazaBinding binding;
    private String mParam1;
    private String mParam2;

    public RayquazaFragment() {
        // Required empty public constructor
    }
    public static RayquazaFragment newInstance(String param1, String param2) {
        RayquazaFragment fragment = new RayquazaFragment();
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
        binding = FragmentRayquazaBinding.inflate(inflater, container, false);

        View root = binding.getRoot();
        BottomNavigationView navView = requireActivity().findViewById(R.id.nav_view);
        navView.setVisibility(View.INVISIBLE);


        Spinner spinner = root.findViewById(R.id.imageSpinner);

        // Define las imágenes que deseas mostrar en el Spinner
        Integer[] images = {R.drawable.rayquaza_home, R.drawable.rhyperior_home, R.drawable.dragonite_home};

        // Crea un adaptador personalizado y configúralo en el Spinner
        ImageSpinnerAdapter adapter = new ImageSpinnerAdapter(requireContext(), R.layout.item_spinner_image, images);
        spinner.setAdapter(adapter);

        ImageView imageView = root.findViewById(R.id.ImagenPrueba);

// Cargar y mostrar un GIF desde una URL
        Glide.with(this).asGif().load(R.drawable.ichigo).into(imageView);

// Cargar y mostrar un GIF desde recursos


        return root;
    }
}
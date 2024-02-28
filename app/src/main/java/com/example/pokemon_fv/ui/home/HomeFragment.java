package com.example.pokemon_fv.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.pokemon_fv.R;
import com.example.pokemon_fv.databinding.FragmentHomeBinding;
import com.example.pokemon_fv.ui.dashboard.DashboardFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        LinearLayout lucario = root.findViewById(R.id.lucario);

        LinearLayout zoroark = root.findViewById(R.id.zoroark);

        LinearLayout rayquaza = root.findViewById(R.id.rayquaza);

        // Set OnClickListener to navigate to another fragment
        lucario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YourFragment" with the fragment you want to navigate to
                Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main).navigate(R.id.lucarioFragment);
            }
        });


        zoroark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YourFragment" with the fragment you want to navigate to
                Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main).navigate(R.id.zoroarkFragment);
            }
        });


        rayquaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YourFragment" with the fragment you want to navigate to
                Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main).navigate(R.id.rayquazaFragment);
            }
        });

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
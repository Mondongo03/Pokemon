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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

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
    public void onResume() {
        super.onResume();

        // Hacer visible el BottomNavigationView
        BottomNavigationView bottomNav = requireActivity().findViewById(R.id.nav_view);
        bottomNav.setVisibility(View.VISIBLE);
    }

    @Override
    public void onPause() {
        super.onPause();

        int currentFragmentId = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main).getCurrentDestination().getId();

        // Hacer invisible el BottomNavigationView
        if (currentFragmentId == R.id.navigation_dashboard || currentFragmentId == R.id.navigation_notifications || currentFragmentId == R.id.navigation_home) {
            BottomNavigationView bottomNav = requireActivity().findViewById(R.id.nav_view);
            bottomNav.setVisibility(View.VISIBLE);
        }
        else {
            BottomNavigationView bottomNav = requireActivity().findViewById(R.id.nav_view);
            bottomNav.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
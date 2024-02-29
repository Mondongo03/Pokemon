package com.example.pokemon_fv.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.pokemon_fv.R;
import com.example.pokemon_fv.databinding.FragmentDashboardBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
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
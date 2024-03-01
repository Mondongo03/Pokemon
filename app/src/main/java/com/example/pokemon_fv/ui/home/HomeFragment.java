package com.example.pokemon_fv.ui.home;

import android.os.Bundle;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import com.example.pokemon_fv.R;
import com.example.pokemon_fv.databinding.FragmentHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        LinearLayout lucario = root.findViewById(R.id.lucario);

        LinearLayout zoroark = root.findViewById(R.id.zoroark);

        LinearLayout rayquaza = root.findViewById(R.id.rayquaza);

        // Set OnClickListener to navigate to another fragment
        lucario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define la transición de difuminado
                Fade fade = new Fade();
                fade.setDuration(500); // Establece la duración de la animación en milisegundos

                // Configura la transición en el NavController
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

                // Configura la animación de transición para la entrada y salida
                NavOptions navOptions = new NavOptions.Builder()
                        .setEnterAnim(android.R.anim.fade_in) // Animación de entrada
                        .setExitAnim(android.R.anim.fade_out) // Animación de salida
                        .setPopEnterAnim(android.R.anim.fade_in) // Animación al retroceder
                        .setPopExitAnim(android.R.anim.fade_out) // Animación al retroceder
                        .build();

                // Realiza la transición con animación
                navController.navigate(R.id.lucarioFragment, null, navOptions);
            }
        });



        zoroark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define la transición de difuminado
                Fade fade = new Fade();
                fade.setDuration(500); // Establece la duración de la animación en milisegundos

                // Configura la transición en el NavController
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

                // Configura la animación de transición para la entrada y salida
                NavOptions navOptions = new NavOptions.Builder()
                        .setEnterAnim(android.R.anim.fade_in) // Animación de entrada
                        .setExitAnim(android.R.anim.fade_out) // Animación de salida
                        .setPopEnterAnim(android.R.anim.fade_in) // Animación al retroceder
                        .setPopExitAnim(android.R.anim.fade_out) // Animación al retroceder
                        .build();

                // Realiza la transición con animación
                navController.navigate(R.id.zoroarkFragment, null, navOptions);
            }
        });


        rayquaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define la transición de difuminado
                Fade fade = new Fade();
                fade.setDuration(500); // Establece la duración de la animación en milisegundos

                // Configura la transición en el NavController
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

                // Configura la animación de transición para la entrada y salida
                NavOptions navOptions = new NavOptions.Builder()
                        .setEnterAnim(android.R.anim.fade_in) // Animación de entrada
                        .setExitAnim(android.R.anim.fade_out) // Animación de salida
                        .setPopEnterAnim(android.R.anim.fade_in) // Animación al retroceder
                        .setPopExitAnim(android.R.anim.fade_out) // Animación al retroceder
                        .build();

                // Realiza la transición con animación
                navController.navigate(R.id.rayquazaFragment, null, navOptions);
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
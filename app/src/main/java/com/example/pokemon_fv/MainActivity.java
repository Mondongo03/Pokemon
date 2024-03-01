package com.example.pokemon_fv;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.pokemon_fv.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,   // ID del destino de nivel superior (puede haber múltiples)
                R.id.navigation_dashboard,
                R.id.navigation_notifications
        ).build();

        // Mueve la inicialización de navView aquí
        BottomNavigationView navView = findViewById(R.id.nav_view);

        // Configura la navegación
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            // Verifica si el fragmento actual es StartFragment
            if (destination.getId() == R.id.startFragment) {
                // Si es StartFragment, haz que el BottomNavigationView sea invisible
                navView.setVisibility(View.INVISIBLE);
            } else {
                // Si no es StartFragment, haz que el BottomNavigationView sea visible
                navView.setVisibility(View.VISIBLE);
            }
        });
    }
}

package com.example.pokemon_fv.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.pokemon_fv.R;
import com.example.pokemon_fv.databinding.FragmentDashboardBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    boolean bicho_atacante_clickado = false;
    boolean siniestro_atacante_clickado = false;
    boolean agua_atacante_clickado = false;
    boolean electrico_atacante_clickado = false;
    boolean psiquico_atacante_clickado = false;
    boolean roca_atacante_clickado = false;
    boolean volador_atacante_clickado = false;
    boolean fantasma_atacante_clickado = false;
    boolean fuego_atacante_clickado = false;
    boolean dragon_atacante_clickado = false;
    boolean tierra_atacante_clickado = false;
    boolean hada_atacante_clickado = false;
    boolean veneno_atacante_clickado = false;
    boolean normal_atacante_clickado = false;
    boolean hielo_atacante_clickado = false;
    boolean lucha_atacante_clickado = false;
    boolean acero_atacante_clickado = false;
    boolean bicho_defensor_clickado = false;
    boolean siniestro_defensor_clickado = false;
    boolean agua_defensor_clickado = false;
    boolean electrico_defensor_clickado = false;
    boolean psiquico_defensor_clickado = false;
    boolean roca_defensor_clickado = false;
    boolean volador_defensor_clickado = false;
    boolean fantasma_defensor_clickado = false;
    boolean fuego_defensor_clickado = false;
    boolean dragon_defensor_clickado = false;
    boolean tierra_defensor_clickado = false;
    boolean hada_defensor_clickado = false;
    boolean veneno_defensor_clickado = false;
    boolean normal_defensor_clickado = false;
    boolean hielo_defensor_clickado = false;
    boolean lucha_defensor_clickado = false;
    boolean acero_defensor_clickado = false;


    ImageView bicho_atacante;
    ImageView siniestro_atacante;
    ImageView agua_atacante;
    ImageView electrico_atacante;
    ImageView psiquico_atacante;
    ImageView roca_atacante;
    ImageView voaldor_atacante;
    ImageView fantasma_atacante;
    ImageView fuego_atacante;
    ImageView dragon_atacante;
    ImageView tierra_atacante;
    ImageView hada_atacante;
    ImageView veneno_atacante;
    ImageView normal_atacante;
    ImageView hielo_atacante;
    ImageView lucha_atacante;
    ImageView acero_atacante;

    ImageView bicho_defensor;
    ImageView siniestro_defensor;
    ImageView agua_defensor;
    ImageView electrico_defensor;
    ImageView psiquico_defensor;
    ImageView roca_defensor;
    ImageView voaldor_defensor;
    ImageView fantasma_defensor;
    ImageView fuego_defensor;
    ImageView dragon_defensor;
    ImageView tierra_defensor;
    ImageView hada_defensor;
    ImageView veneno_defensor;
    ImageView normal_defensor;
    ImageView hielo_defensor;
    ImageView lucha_defensor;
    ImageView acero_defensor;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);

        bicho_defensor = binding.bichoDefensor;
        siniestro_defensor = binding.siniestroDefensor;
        agua_defensor = binding.aguaDefensor;
        electrico_defensor = binding.electricoDefensor;
        psiquico_defensor = binding.psiquicoDefensor;
        roca_defensor = binding.rocaDefensor;
        voaldor_defensor = binding.voladorDefensor;
        fantasma_defensor = binding.fantasmaDefensor;
        fuego_defensor = binding.fuegoDefensor;
        dragon_defensor = binding.dragonDefensor;
        tierra_defensor = binding.tierraDefensor;
        hada_defensor = binding.hadaDefensor;
        veneno_defensor = binding.venenoDefensor;
        normal_defensor = binding.normalDefensor;
        hielo_defensor = binding.hieloDefensor;
        lucha_defensor = binding.luchaDefensor;
        acero_defensor = binding.aceroDefensor;

        bicho_atacante = binding.bichoAtacante;
        siniestro_atacante = binding.siniestroAtacante;
        agua_atacante = binding.aguaAtacante;
        electrico_atacante = binding.electricoAtacante;
        psiquico_atacante = binding.psiquicoAtacante;
        roca_atacante = binding.rocaAtacante;
        voaldor_atacante = binding.voladorAtacante;
        fantasma_atacante = binding.fantasmaAtacante;
        fuego_atacante = binding.fuegoAtacante;
        dragon_atacante = binding.dragonAtacante;
        tierra_atacante = binding.tierraAtacante;
        hada_atacante = binding.hadaAtacante;
        veneno_atacante = binding.venenoAtacante;
        normal_atacante = binding.normalAtacante;
        hielo_atacante = binding.hieloAtacnante;
        lucha_atacante = binding.luchaAtacante;
        acero_atacante = binding.aceroAtacante;

        View root = binding.getRoot();

        bicho_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bicho_atacante_clickado) bicho_atacante_clickado = false;
                else bicho_atacante_clickado = true;

                if (bicho_atacante_clickado) bicho_atacante.setImageResource(R.drawable.bicho_clickado);
                else bicho_atacante.setImageResource(R.drawable.bicho);
            }
        });

        siniestro_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (siniestro_atacante_clickado) siniestro_atacante_clickado = false;
                else siniestro_atacante_clickado = true;

                if (siniestro_atacante_clickado) siniestro_atacante.setImageResource(R.drawable.siniestro_clickado);
                else siniestro_atacante.setImageResource(R.drawable.siniestro);
            }
        });

        agua_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (agua_atacante_clickado) agua_atacante_clickado = false;
                else agua_atacante_clickado = true;

                if (agua_atacante_clickado) agua_atacante.setImageResource(R.drawable.agua_clickado);
                else agua_atacante.setImageResource(R.drawable.agua);
            }
        });

        electrico_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (electrico_atacante_clickado) electrico_atacante_clickado = false;
                else electrico_atacante_clickado = true;

                if (electrico_atacante_clickado) electrico_atacante.setImageResource(R.drawable.electrico_clickado);
                else electrico_atacante.setImageResource(R.drawable.electrico);
            }
        });

        psiquico_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (psiquico_atacante_clickado) psiquico_atacante_clickado = false;
                else psiquico_atacante_clickado = true;

                if (psiquico_atacante_clickado) psiquico_atacante.setImageResource(R.drawable.psiquico_clickado);
                else psiquico_atacante.setImageResource(R.drawable.psiquico);
            }
        });

        roca_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (roca_atacante_clickado) roca_atacante_clickado = false;
                else roca_atacante_clickado = true;

                if (roca_atacante_clickado) roca_atacante.setImageResource(R.drawable.roca_clickado);
                else roca_atacante.setImageResource(R.drawable.roca);
            }
        });

        voaldor_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (volador_atacante_clickado) volador_atacante_clickado = false;
                else volador_atacante_clickado = true;

                if (volador_atacante_clickado) voaldor_atacante.setImageResource(R.drawable.volador2_clickado);
                else voaldor_atacante.setImageResource(R.drawable.volador2);
            }
        });

        fuego_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fuego_atacante_clickado) fuego_atacante_clickado = false;
                else fuego_atacante_clickado = true;

                if (fuego_atacante_clickado) fuego_atacante.setImageResource(R.drawable.fuego_clickado);
                else fuego_atacante.setImageResource(R.drawable.fuego);
            }
        });

        dragon_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dragon_atacante_clickado) dragon_atacante_clickado = false;
                else dragon_atacante_clickado = true;

                if (dragon_atacante_clickado) dragon_atacante.setImageResource(R.drawable.dragon2_clickado);
                else dragon_atacante.setImageResource(R.drawable.dragon2);
            }
        });

        tierra_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tierra_atacante_clickado) tierra_atacante_clickado = false;
                else tierra_atacante_clickado = true;

                if (tierra_atacante_clickado) tierra_atacante.setImageResource(R.drawable.tierra_clickado);
                else tierra_atacante.setImageResource(R.drawable.tierra);
            }
        });

        hada_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hada_atacante_clickado) hada_atacante_clickado = false;
                else hada_atacante_clickado = true;

                if (hada_atacante_clickado) hada_atacante.setImageResource(R.drawable.hada_clickado);
                else hada_atacante.setImageResource(R.drawable.hada);
            }
        });

        lucha_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lucha_atacante_clickado) lucha_atacante_clickado = false;
                else lucha_atacante_clickado = true;

                if (lucha_atacante_clickado) lucha_atacante.setImageResource(R.drawable.lucha2_clickado);
                else lucha_atacante.setImageResource(R.drawable.lucha2);
            }
        });

        acero_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (acero_atacante_clickado) acero_atacante_clickado = false;
                else acero_atacante_clickado = true;

                if (acero_atacante_clickado) acero_atacante.setImageResource(R.drawable.acero2_clickado);
                else acero_atacante.setImageResource(R.drawable.acero2);
            }
        });

        normal_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (normal_atacante_clickado) normal_atacante_clickado = false;
                else normal_atacante_clickado = true;

                if (normal_atacante_clickado) normal_atacante.setImageResource(R.drawable.normal2_clickado);
                else normal_atacante.setImageResource(R.drawable.normal2);
            }
        });

        hielo_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hielo_atacante_clickado) hielo_atacante_clickado = false;
                else hielo_atacante_clickado = true;

                if (hielo_atacante_clickado) hielo_atacante.setImageResource(R.drawable.hielo_clickado);
                else hielo_atacante.setImageResource(R.drawable.hielo);
            }
        });

        veneno_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (veneno_atacante_clickado) veneno_atacante_clickado = false;
                else veneno_atacante_clickado = true;

                if (veneno_atacante_clickado) veneno_atacante.setImageResource(R.drawable.veneno_clickado);
                else veneno_atacante.setImageResource(R.drawable.veneno);
            }
        });

        fantasma_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fantasma_atacante_clickado) fantasma_atacante_clickado = false;
                else fantasma_atacante_clickado = true;

                if (fantasma_atacante_clickado) fantasma_atacante.setImageResource(R.drawable.fantasma2_clickado);
                else fantasma_atacante.setImageResource(R.drawable.fantasma2);
            }
        });

        agua_atacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (agua_atacante_clickado) agua_atacante_clickado = false;
                else agua_atacante_clickado = true;

                if (agua_atacante_clickado) agua_atacante.setImageResource(R.drawable.agua_clickado);
                else agua_atacante.setImageResource(R.drawable.agua);
            }
        });

        bicho_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bicho_defensor_clickado) bicho_defensor_clickado = false;
                else bicho_defensor_clickado = true;

                if (bicho_defensor_clickado) bicho_defensor.setImageResource(R.drawable.bicho_clickado);
                else bicho_defensor.setImageResource(R.drawable.bicho);
            }
        });

        siniestro_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (siniestro_defensor_clickado) siniestro_defensor_clickado = false;
                else siniestro_defensor_clickado = true;

                if (siniestro_defensor_clickado) siniestro_defensor.setImageResource(R.drawable.siniestro_clickado);
                else siniestro_defensor.setImageResource(R.drawable.siniestro);
            }
        });

        agua_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (agua_defensor_clickado) agua_defensor_clickado = false;
                else agua_defensor_clickado = true;

                if (agua_defensor_clickado) agua_defensor.setImageResource(R.drawable.agua_clickado);
                else agua_defensor.setImageResource(R.drawable.agua);
            }
        });

        electrico_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (electrico_defensor_clickado) electrico_defensor_clickado = false;
                else electrico_defensor_clickado = true;

                if (electrico_defensor_clickado) electrico_defensor.setImageResource(R.drawable.electrico_clickado);
                else electrico_defensor.setImageResource(R.drawable.electrico);
            }
        });

        psiquico_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (psiquico_defensor_clickado) psiquico_defensor_clickado = false;
                else psiquico_defensor_clickado = true;

                if (psiquico_defensor_clickado) psiquico_defensor.setImageResource(R.drawable.psiquico_clickado);
                else psiquico_defensor.setImageResource(R.drawable.psiquico);
            }
        });

        roca_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (roca_defensor_clickado) roca_defensor_clickado = false;
                else roca_defensor_clickado = true;

                if (roca_defensor_clickado) roca_defensor.setImageResource(R.drawable.roca_clickado);
                else roca_defensor.setImageResource(R.drawable.roca);
            }
        });

        voaldor_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (volador_defensor_clickado) volador_defensor_clickado = false;
                else volador_defensor_clickado = true;

                if (volador_defensor_clickado) voaldor_defensor.setImageResource(R.drawable.volador2_clickado);
                else voaldor_defensor.setImageResource(R.drawable.volador2);
            }
        });

        fuego_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fuego_defensor_clickado) fuego_defensor_clickado = false;
                else fuego_defensor_clickado = true;

                if (fuego_defensor_clickado) fuego_defensor.setImageResource(R.drawable.fuego_clickado);
                else fuego_defensor.setImageResource(R.drawable.fuego);
            }
        });

        dragon_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dragon_defensor_clickado) dragon_defensor_clickado = false;
                else dragon_defensor_clickado = true;

                if (dragon_defensor_clickado) dragon_defensor.setImageResource(R.drawable.dragon2_clickado);
                else dragon_defensor.setImageResource(R.drawable.dragon2);
            }
        });

        tierra_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tierra_defensor_clickado) tierra_defensor_clickado = false;
                else tierra_defensor_clickado = true;

                if (tierra_defensor_clickado) tierra_defensor.setImageResource(R.drawable.tierra_clickado);
                else tierra_defensor.setImageResource(R.drawable.tierra);
            }
        });

        hada_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hada_defensor_clickado) hada_defensor_clickado = false;
                else hada_defensor_clickado = true;

                if (hada_defensor_clickado) hada_defensor.setImageResource(R.drawable.hada_clickado);
                else hada_defensor.setImageResource(R.drawable.hada);
            }
        });

        lucha_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lucha_defensor_clickado) lucha_defensor_clickado = false;
                else lucha_defensor_clickado = true;

                if (lucha_defensor_clickado) lucha_defensor.setImageResource(R.drawable.lucha2_clickado);
                else lucha_defensor.setImageResource(R.drawable.lucha2);
            }
        });

        fantasma_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fantasma_defensor_clickado) fantasma_defensor_clickado = false;
                else fantasma_defensor_clickado = true;

                if (fantasma_defensor_clickado) fantasma_defensor.setImageResource(R.drawable.fantasma2_clickado);
                else fantasma_defensor.setImageResource(R.drawable.fantasma2);
            }
        });

        acero_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (acero_defensor_clickado) acero_defensor_clickado = false;
                else acero_defensor_clickado = true;

                if (acero_defensor_clickado) acero_defensor.setImageResource(R.drawable.acero2_clickado);
                else acero_defensor.setImageResource(R.drawable.acero2);
            }
        });

        veneno_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (veneno_defensor_clickado) veneno_defensor_clickado = false;
                else veneno_defensor_clickado = true;

                if (veneno_defensor_clickado) veneno_defensor.setImageResource(R.drawable.veneno_clickado);
                else veneno_defensor.setImageResource(R.drawable.veneno);
            }
        });

        normal_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (normal_defensor_clickado) normal_defensor_clickado = false;
                else normal_defensor_clickado = true;

                if (normal_defensor_clickado) normal_defensor.setImageResource(R.drawable.normal2_clickado);
                else normal_defensor.setImageResource(R.drawable.normal2);
            }
        });

        hielo_defensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hielo_defensor_clickado) hielo_defensor_clickado = false;
                else hielo_defensor_clickado = true;

                if (hielo_defensor_clickado) hielo_defensor.setImageResource(R.drawable.hielo_clickado);
                else hielo_defensor.setImageResource(R.drawable.hielo);
            }
        });

        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
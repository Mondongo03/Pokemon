package com.example.pokemon_fv;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContraFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView contraText;

    public ContraFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContraFragment newInstance(String param1, String param2) {
        ContraFragment fragment = new ContraFragment();
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

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_contra, container, false);
        contraText = rootView.findViewById(R.id.btnContraRecu);
        contraText.setOnClickListener(new View.OnClickListener() {
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
                navController.navigate(R.id.loginFragment, null, navOptions);
            }
        });

        return rootView;
    }
}
package com.example.pokemon_fv;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.jsibbold.zoomage.ZoomageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private EditText emailEditText;
    private TextView loginText;
    private TextView contraText;

    private TextView registroText;
    public LoginFragment() {
        // Required empty public constructor
    }

    public static LoginFragment newInstance(String param1, String param2) {
        LoginFragment fragment = new LoginFragment();
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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        // Find views
        emailEditText = rootView.findViewById(R.id.emailEditText);
        loginText = rootView.findViewById(R.id.btnLogin);
        registroText = rootView.findViewById(R.id.btnRegister);
        contraText = rootView.findViewById(R.id.textContra);

        // Set click listener to the labelTextView
        emailEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set focus to the emailEditText
                emailEditText.requestFocus();
            }
        });

        loginText.setOnClickListener(new View.OnClickListener() {
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
                navController.navigate(R.id.navigation_home, null, navOptions);
            }
        });

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
                navController.navigate(R.id.contraFragment, null, navOptions);
            }
        });

        registroText.setOnClickListener(new View.OnClickListener() {
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
                navController.navigate(R.id.registroFragment, null, navOptions);
            }
        });

        ZoomageView zoomageView = rootView.findViewById(R.id.oak);

        // Configurar la imagen en el ZoomageView
        zoomageView.setImageResource(R.drawable.oak);


        return rootView;
    }
}
package com.example.pokemon_fv;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.example.pokemon_fv.databinding.FragmentStartBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StartFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class StartFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private FragmentStartBinding binding;
    private Handler handler;
    public GifDrawable gifDrawable;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StartFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StartFragment newInstance(String param1, String param2) {
        StartFragment fragment = new StartFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public StartFragment() {
        // Required empty public constructor
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
        binding = FragmentStartBinding.inflate(inflater, container, false);

        View root = binding.getRoot();

        ImageView imageView = root.findViewById(R.id.pokeball_gif);


// Variable global para almacenar la animación GIF


// En tu método onCreateView() o onViewCreated()
        Glide.with(requireContext())
                .asGif()
                .load(R.drawable.pokeball_png_2)
                .into(new CustomTarget<GifDrawable>() {
                    @Override
                    public void onResourceReady(@NonNull GifDrawable resource, @Nullable Transition<? super GifDrawable> transition) {
                        gifDrawable = resource;
                        imageView.setImageDrawable(resource);
                        resource.stop(); // Pausa la animación inicialmente
                    }

                    @Override
                    public void onLoadCleared(@Nullable Drawable placeholder) {
                        // No es necesario hacer nada aquí
                    }
                });

// En tu OnClickListener
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gifDrawable != null) {
                    gifDrawable.start();
                }
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {

                        Fade fade = new Fade();
                        fade.setDuration(500);

                        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
                        NavOptions navOptions = new NavOptions.Builder()
                                .setEnterAnim(android.R.anim.fade_in)
                                .setExitAnim(android.R.anim.fade_out)
                                .setPopEnterAnim(android.R.anim.fade_in)
                                .setPopExitAnim(android.R.anim.fade_out)
                                .build();

                        navController.navigate(R.id.loginFragment , null, navOptions);
                    }
            }, 1800);
            }
        });


        return root;
    }
}

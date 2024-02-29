package com.example.pokemon_fv;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.androidplot.Plot;
import com.androidplot.pie.PieChart;
import com.androidplot.pie.PieRenderer;
import com.androidplot.pie.Segment;
import com.androidplot.pie.SegmentFormatter;
import com.androidplot.xy.BarRenderer;
import com.androidplot.xy.BoundaryMode;
import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYGraphWidget;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;
import com.androidplot.xy.XYSeriesRenderer;
import com.bumptech.glide.Glide;
import com.example.pokemon_fv.databinding.FragmentLucarioBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;




public class LucarioFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentLucarioBinding binding;
    private String mParam1;
    private String mParam2;

    //private BarChart lucarioStatsChart;
    private XYPlot lucarioStatsPlot;
    public LucarioFragment() {
        // Required empty public constructor
    }

    public static LucarioFragment newInstance(String param1, String param2) {
        LucarioFragment fragment = new LucarioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        BottomNavigationView navView = requireActivity().findViewById(R.id.nav_view);
        navView.setVisibility(View.INVISIBLE);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLucarioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /*lucarioStatsChart = root.findViewById(R.id.lucarioStatsChart);

        // Crear datos de ejemplo
        List<BarEntry> entries1 = new ArrayList<>();
        entries1.add(new BarEntry(0, new float[]{80f, 60f}));
        entries1.add(new BarEntry(1, new float[]{70f, 80f}));
        entries1.add(new BarEntry(2, new float[]{90f, 70f}));
        entries1.add(new BarEntry(3, new float[]{75f, 85f}));
        entries1.add(new BarEntry(4, new float[]{65f, 75f}));
        entries1.add(new BarEntry(5, new float[]{85f, 95f}));

        BarDataSet dataSet1 = new BarDataSet(entries1, "Lucario 1");
        dataSet1.setColors(new int[]{Color.RED, Color.BLUE}); // Colores para cada conjunto de datos

        // Configurar el gráfico
        BarData barData = new BarData(dataSet1);
        lucarioStatsChart.setData(barData);
        lucarioStatsChart.setDrawValueAboveBar(false);

        XAxis xAxis = lucarioStatsChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        YAxis leftAxis = lucarioStatsChart.getAxisLeft();
        leftAxis.setAxisMinimum(0f);

        YAxis rightAxis = lucarioStatsChart.getAxisRight();
        rightAxis.setAxisMinimum(0f);

        Legend legend = lucarioStatsChart.getLegend();
        legend.setForm(Legend.LegendForm.SQUARE);
        legend.setFormSize(10f);
        legend.setTextSize(12f);
        legend.setXEntrySpace(5f);

        lucarioStatsChart.invalidate();*/

        ImageView back = root.findViewById(R.id.back);

        ImageView imageView = root.findViewById(R.id.gifLucario);



// Cargar y mostrar un GIF desde una URL
        Glide.with(this).asGif().load(R.drawable.lucario_gif).into(imageView);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back
                requireActivity().onBackPressed();
            }
        });

        return root;
    }


    /*private void setupPieChart() {
        // Crear un gráfico circular (pie chart)
        lucarioStatsPlot.clear();

        // Configurar los datos de ejemplo
        SegmentFormatter segmentFormatter = new SegmentFormatter(Color.RED);
        Segment segment1 = new Segment("Ataque", 80);
        Segment segment2 = new Segment("Defensa", 70);
        Segment segment3 = new Segment("Vida", 90);
        Segment segment4 = new Segment("Ataque Especial", 75);
        Segment segment5 = new Segment("Defensa Especial", 65);
        Segment segment6 = new Segment("Velocidad", 85);

        // Añadir los segmentos al gráfico circular
        lucarioStatsPlot.addSegment(segment1, segmentFormatter);
        lucarioStatsPlot.addSegment(segment2, segmentFormatter);
        lucarioStatsPlot.addSegment(segment3, segmentFormatter);
        lucarioStatsPlot.addSegment(segment4, segmentFormatter);
        lucarioStatsPlot.addSegment(segment5, segmentFormatter);
        lucarioStatsPlot.addSegment(segment6, segmentFormatter);

        // Configurar el gráfico circular
        lucarioStatsPlot.getBorderPaint().setColor(Color.TRANSPARENT);
        lucarioStatsPlot.getBackgroundPaint().setColor(Color.TRANSPARENT);
        lucarioStatsPlot.getRenderer(PieRenderer.class).setDonutSize(0, PieRenderer.DonutMode.PERCENT);

        // Mostrar el gráfico
        lucarioStatsPlot.redraw();
    }*/
}
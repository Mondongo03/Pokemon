package com.example.pokemon_fv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class ImageSpinnerAdapter extends ArrayAdapter<Integer> {
    private Context mContext;
    private Integer[] mImages;

    public ImageSpinnerAdapter(Context context, int resource, Integer[] images) {
        super(context, resource, images);
        this.mContext = context;
        this.mImages = images;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getImageForPosition(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getImageForPosition(position, convertView, parent);
    }

    private View getImageForPosition(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_spinner_image, parent, false);
        }

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(mImages[position]);

        return view;
    }
}


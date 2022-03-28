package com.example.pocollect;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PokemonAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ArrayList<PokemonItem> items;

    public PokemonAdapter(Context context, ArrayList<PokemonItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public int change(int i){
        PokemonItem item = items.get(i);
        item.setIscheck(!item.getIscheck());
        if (item.getIscheck()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (view == null) {
            view = inflater.inflate(R.layout.pokemon_card_view,null);
        }

        TextView number = view.findViewById(R.id.pokemon_number);
        ImageView image = view.findViewById(R.id.pokemon_img);
        TextView name = view.findViewById(R.id.pokemon_name);

        PokemonItem item = items.get(i);

        //number
        number.setText("no."+String.valueOf(item.getNumber()));

        //img
        Resources res = context.getResources();
        if (item.getIscheck()) {
            int resID = res.getIdentifier(item.getImage(),"drawable", context.getPackageName());
            image.setImageResource(resID);
        }
        else {
            int resID = res.getIdentifier(item.getImage(),"drawable", context.getPackageName());
            image.setImageResource(resID);
            Log.d("포번", String.valueOf(i));
            Drawable d = image.getDrawable().mutate();
            image.setImageDrawable(convertGrayScale(d));
        }

        //name
        name.setText(item.getName());

        return view;
    }

    public Drawable convertGrayScale(Drawable d){
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);                    //0이면 grayscale
        ColorMatrixColorFilter cf = new ColorMatrixColorFilter(matrix);
        d.setColorFilter(cf);

        return d;
    }
}

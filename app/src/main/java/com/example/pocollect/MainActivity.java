package com.example.pocollect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int trueCheckCount = 0;
    TextView count;
    GridView pokemonGrid;
    ArrayList<PokemonItem> pokemon_array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        count = findViewById(R.id.pokemon_count_txt);
        pokemonGrid = findViewById(R.id.pokemon_Grid);

        pokemon_array = new Database().getPokemonList();
        count.setText("포켓몬 도감 : "+ trueCheckCount+"/"+pokemon_array.size());

        PokemonAdapter adapter = new PokemonAdapter(getApplicationContext(),pokemon_array);
        pokemonGrid.setAdapter(adapter);

        pokemonGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                trueCheckCount += adapter.change(i);
                count.setText("포켓몬 도감 : "+ trueCheckCount+"/"+pokemon_array.size());
                adapter.notifyDataSetChanged();
            }
        });
    }
    private void saveState(){
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("count",trueCheckCount);
        Log.d("배열길이", String.valueOf(pokemon_array.size()));
        for (int i = 1; i <= pokemon_array.size(); i++){
            PokemonItem item = pokemon_array.get(i-1);
            editor.putBoolean(String.valueOf(i),item.getIscheck());
            Log.d("저장출력", String.valueOf(item.getIscheck()));
        }
        Log.d("저장하기", "saveState: ");
        editor.commit();
    }
    @Override
    protected void onPause() {
        super.onPause();
        saveState();
    }

    private void restoreState(){
        SharedPreferences pref = getSharedPreferences("pref",Activity.MODE_PRIVATE);
        Log.d("배열길이", String.valueOf(pokemon_array.size()));
        if (pref != null){
            for (int i = 1; i <= pokemon_array.size(); i++){
                PokemonItem item = pokemon_array.get(i-1);
                if (pref.contains(String.valueOf(i))) {
                    item.setIscheck(pref.getBoolean(String.valueOf(i),false));
                    Log.d("불러오기출력", String.valueOf(item.getIscheck()));
                }
            }
            if (pref.contains("count")){
                trueCheckCount = pref.getInt("count",-1);
                count.setText("포켓몬 도감 : "+ trueCheckCount+"/"+pokemon_array.size());
            }
            Log.d("불러오기", "saveState: ");
        }

    }
    @Override
    protected void onResume() {
        super.onResume();
        restoreState();
    }
}


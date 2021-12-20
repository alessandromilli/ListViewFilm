package com.example.listviewfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String film[] = {
                "Avatar",
                "Transformers",
                "Star Wars",
                "Esorciccio",
                "7 anni a Napoli"
        };
        ListView lv_film = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,  film);
        lv_film.setAdapter(adapter);
        lv_film.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String titolo = (String)lv_film.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), titolo, Toast.LENGTH_SHORT).show();

            }
        });
    }

}
package org.fp.dam.pmdm.practicaguiada3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.recyclerView);
        rv.hasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        List<String> l = Arrays.asList("Gustavo", "Daniel");
        rv.setAdapter(new NombresAdapter(l));
    }
}
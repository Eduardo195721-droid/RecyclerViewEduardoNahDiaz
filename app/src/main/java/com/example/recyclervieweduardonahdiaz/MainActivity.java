package com.example.recyclervieweduardonahdiaz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }


    public void  init () {
        elements = new ArrayList<>();
        elements.add (new ListElement("#561556", "Josesito","Colombia","Activo"));
        elements.add (new ListElement("#852456", "Fernando","Venezuela","Inactivo"));
        elements.add (new ListElement("#159753", "Maria","Mexico","Activo"));
        elements.add (new ListElement("#446655", "Jesica","España","Activo"));
        elements.add (new ListElement("#127845", "Ignacio","Peru","Inactivo"));

        ListAdapter ListAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listReciclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(ListAdapter);


    }
}
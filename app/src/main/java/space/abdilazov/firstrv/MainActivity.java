package space.abdilazov.firstrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Modelka> list = new ArrayList<Modelka>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();

        recyclerView = findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter(this,list);
        recyclerView.setAdapter(adapter);

    }

    private void initData() {

        list.add(new Modelka("C++",R.drawable.plusplus));
        list.add(new Modelka("Java",R.drawable.java));
        list.add(new Modelka("Swift",R.drawable.swift));
        list.add(new Modelka("Kotlin",R.drawable.kotlin));
        list.add(new Modelka("C",R.drawable.c));
        list.add(new Modelka("Python",R.drawable.python));
        list.add(new Modelka("Html",R.drawable.html));
        list.add(new Modelka("JavaScript",R.drawable.js));

    }
}
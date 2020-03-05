package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    String st1[],st2[];
    int image[]={R.drawable.c,R.drawable.c_plus,R.drawable.java,R.drawable.js,R.drawable.ts,R.drawable.python,R.drawable.vs,R.drawable.swiftt};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview=(RecyclerView) findViewById(R.id.recycler_view);

        st1=getResources().getStringArray(R.array.programming_languages);
        st2=getResources().getStringArray(R.array.Description);

        My_adapter myadapter = new My_adapter(this,st1,st2,image);

        recyclerview.setAdapter(myadapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
    }
}

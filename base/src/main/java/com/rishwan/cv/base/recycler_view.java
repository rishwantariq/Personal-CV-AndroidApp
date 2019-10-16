package com.rishwan.cv.base;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rishwan.cv.adapters.CustomAdapter;

public class recycler_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView eduList = findViewById(R.id.educationList);
        eduList.setLayoutManager(new LinearLayoutManager(this));

       // String [] Skills = {"Skill 1", "Skill 2", "Skill 3", "Skill 4", "Skill 5", "Skill 6"};
       // eduList.setAdapter(new CustomAdapter(Skills));
    }
}

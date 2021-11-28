package com.example.latestrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter =new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){
        ArrayList<Model> models=new ArrayList<>();
        Model m=new Model();

        m.setId(1);
        m.setPath(FirstSplashLogin.class);
        m.setTitle("First Project");
        m.setDescription("green splash with login screen");
        m.setImg(R.drawable.ic_launcher_foreground);
        models.add(m);

        m=new Model();
        m.setId(2);
        m.setPath(SecondSplashLogin.class);
        m.setTitle("Second Project");
        m.setDescription("colorable splash screen with login screen");
        m.setImg(R.drawable.ic_launcher_foreground);
        models.add(m);

        m=new Model();
        m.setId(3);
        m.setPath(LetsMove_Main.class);
        m.setTitle("Let's Move");
        m.setDescription("New login Design");
        m.setImg(R.drawable.ic_launcher_foreground);
        models.add(m);

        m=new Model();
        m.setId(4);
        m.setPath(SlopeMain.class);
        m.setTitle("Slope");
        m.setDescription("New world Design");
        m.setImg(R.drawable.ic_launcher_foreground);
        models.add(m);

//        m=new Model();
//        m.setTitle("news feed");
//        m.setDescription("this is new descriptoin");
//        m.setImg(R.drawable.ic_launcher_foreground);
//        models.add(m);
//
//
//        m=new Model();
//        m.setTitle("news feed");
//        m.setDescription("this is new descriptoin");
//        m.setImg(R.drawable.ic_launcher_foreground);
//        models.add(m);

        m.setId(1);
        return models;
    }


}
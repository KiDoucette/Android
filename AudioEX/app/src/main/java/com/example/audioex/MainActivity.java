package com.example.audioex;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ArrayList<String> animalList = new ArrayList<>(Arrays.asList("bear","chicken","cow", "elephant"));


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView0 = findViewById(R.id.imageView0);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);

    }
    @SuppressLint("DiscouragedApi")
    public void imageViewClicked(View view){
        int imageViewId = view.getId();
        ImageView clickedImageView = findViewById(imageViewId);
        String imageViewName = getResources().getResourceEntryName(imageViewId);
        int animalIndex = Integer.parseInt(imageViewName.substring(9));
        String animalName = animalList.get(animalIndex);
        Log.d("DEBUG", "Animal Name: " + animalName);
        Toast.makeText(this, "You clicked the " + animalName, Toast.LENGTH_SHORT).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(animalName, "raw", getPackageName()));
        mediaPlayer.start();
    }
}
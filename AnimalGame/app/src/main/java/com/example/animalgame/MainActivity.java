package com.example.animalgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;

    TextView messageTextView;
    TextView scoreTextView;
    ArrayList<ImageView> imageViewArrayList = new ArrayList<>();
    ArrayList<Integer> animalImageArrayList = new ArrayList<>(Arrays.asList(R.drawable.panda, R.drawable.bee
    , R.drawable.buffalo, R.drawable.cat, R.drawable.bullfinch, R.drawable.chicken, R.drawable.clown_fish,
        R.drawable.crab, R.drawable.deer, R.drawable.elephant, R.drawable.fox, R.drawable.frog, R.drawable.hippo,
            R.drawable.rabbit, R.drawable.ladybug, R.drawable.mouse, R.drawable.lion, R.drawable.rhino,
            R.drawable.sheep, R.drawable.whale, R.drawable.turtle));

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
        imageView8 = findViewById(R.id.imageView8);
        imageViewArrayList = new ArrayList<>(Arrays.asList(imageView0, imageView1, imageView2,
            imageView3, imageView4, imageView5, imageView6, imageView7, imageView8));
        gameSetup();
    }
    public void gameSetup(){
        Collections.shuffle(animalImageArrayList);
        for(int i = 0; i < 9; i++){
            imageViewArrayList.get(i).setImageResource(animalImageArrayList.get(i));
            imageViewArrayList.get(i).setTag(animalImageArrayList.get(i));
        }
    }
    public void imageViewClicked(View view){
        int clickedImageViewID = view.getId();
        ImageView clickedImageView = findViewById(clickedImageViewID);
        String animalName = animalName.substring((animalName.lastIndexOf("/") + 1));
         Toast.makeText(this, "You clicked the " + animalName, Toast.LENGTH_LONG).show();
    }
    public void restartButton(View view){
        gameSetup();
    }
}
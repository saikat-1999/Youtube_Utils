package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (ImageView) findViewById(R.id.display);

        String url = "https://www.youtube.com/watch?v=3NBP7nlQEB8"; //put your url here
        String videoId = url.split("v=")[1];

        String thumbnailMq = "https://img.youtube.com/vi/"+videoId+"/mqdefault.jpg"; //medium quality thumbnail

        String thumbnailHq = "https://img.youtube.com/vi/"+videoId+"/hqdefault.jpg"; //high quality thumbnail

        //Picasso.get().load("http://img.youtube.com/vi/-OKrloDzGpU/mqdefault.jpg").into(display);
        //display.setText(thumbnailHq);
        //String imageUri = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.get().load(thumbnailMq).into(display);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, YoutubePlayerView.class);
                startActivity(i);
            }
        });
    }
}
package com.example.nacho.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img;

    int images[] = {R.drawable.animal1, R.drawable.animal2, R.drawable.animal3, R.drawable.animal4};
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.mainactivity_button1);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        img = (ImageView)findViewById(R.id.mainactivity_imageview1);
        img.setImageResource(images[counter]);
        counter++;
        if (counter > 3) counter = 0;
    }
}

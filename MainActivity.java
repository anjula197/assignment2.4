package com.example.sweety.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toggle_view);
        button = (Button) findViewById(R.id.button3);
        image =(ImageView) findViewById(R.id.image);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button.getText().toString()=="hide")
                {
                    image.setVisibility(View.INVISIBLE);
                    button.setText("show");
                }
                else{
                    image.setVisibility(View.VISIBLE);
                    button.setText("hide");
                }
            }
        });
    }
}

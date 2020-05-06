package com.example.z;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView btnPause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPause = findViewById(R.id.btn_pause);

        btnPause.setOnClickListener(new View.OnClickListener() {
            int button01pos = 0;
            @Override
            public void onClick(View v) {
//                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this)
                if(button01pos==0) {
                    btnPause.setImageResource(R.drawable.player);
                    button01pos = 1;
                }else if(button01pos==1){
                    btnPause.setImageResource(R.drawable.play_button);
                    button01pos = 0;
                }

            }
        });

    }
}

package com.example.de_api;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LightActivity extends AppCompatActivity {

        SeekBar seekBar;
        TextView textView;
        Button row1, row2, row3, row4, row5, row6, row7, row8, row9, row10;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_light);
            seekBar = (SeekBar) findViewById(R.id.seek);
            textView = findViewById(R.id.textView2);
            row1 = findViewById(R.id.row1);
            row2 = findViewById(R.id.row2);
            row3 = findViewById(R.id.row3);
            row4 = findViewById(R.id.row4);
            row5 = findViewById(R.id.row5);
            row6 = findViewById(R.id.row6);
            row7 = findViewById(R.id.row7);
            row8 = findViewById(R.id.row8);
            row9 = findViewById(R.id.row9);
            row10 = findViewById(R.id.row10);
            Button rowmass[] = {row1, row2, row3, row4, row5, row6, row7, row8, row9, row10};


            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                int pval = 0;
                int m = 1;
                int flag = 25;

                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    pval = i;
                    textView.setText(m * 15 + "");
                    if ((pval >= flag) && (m < 9)) {
                        rowmass[m].setBackgroundColor(Color.parseColor("#984E4F"));
                        m += 1;
                        flag += 6;
                    }
                    if ((pval <= flag) && (m > 0)) {
                        rowmass[m].setBackgroundColor(Color.parseColor("#00FFFFFF"));
                        m -= 1;
                        flag -= 6;
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });
        }
    }


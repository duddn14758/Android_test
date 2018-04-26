package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 김영우 on 2018-04-14.
 */

public class result extends AppCompatActivity{

    TextView tv;
    ImageView Img;
    String s1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);

        tv=(TextView)findViewById(R.id.ResView);
        Img=(ImageView)findViewById(R.id.img);

        Intent inintent=getIntent();
        final String Result=inintent.getStringExtra("result");

        switch(Result){
            case "000":
                Img.setImageResource(R.drawable.chicken);
                s1="치킨";
                break;
            case "001":
                Img.setImageResource(R.drawable.jjim);
                s1="찜닭";
                break;
            case "010":
                Img.setImageResource(R.drawable.cow);
                s1="소고기";
                break;
            case "011":
                Img.setImageResource(R.drawable.pig);
                s1="돼지고기";
                break;
            case "100":
                Img.setImageResource(R.drawable.ramen);
                s1="라멘";
                break;
            case "101":
                Img.setImageResource(R.drawable.woo);
                s1="우동";
                break;
            case "110":
                Img.setImageResource(R.drawable.jigae);
                s1="찌개";
                break;
            case "111":
                Img.setImageResource(R.drawable.bibim);
                s1="비빔밥";
                break;

            default:
                break;



        }

        tv.setText(s1+"!");


    }
}

package com.example.foody;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 김영우 on 2018-04-13.
 */

public class select extends AppCompatActivity{

    Button btn1,btn2;   //버튼
    String s1,s2;   //출력될 text
    int a=0;    //선택지 포인터(현재 어디까지 선택했는지)
    String b="";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_activity);

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);

        s1="고기";
        s2="나머지";

        btn1.setText(s1);
        btn2.setText(s2);

        btn1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                   b+=0;
                    select(b);


                }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                b+=1;
                select(b);

            }
        });

    }

    public void select(String selector){
        Intent intent=new Intent(getApplicationContext(),result.class);
        intent.putExtra("result",b);
        switch(selector){
            case "0":
                btn1.setText("닭고기?");
                btn2.setText("닭말고");
                break;
            case "1":
                btn1.setText("면");
                btn2.setText("밥");
                break;
            case "00":
                btn1.setText("튀김?");
                btn2.setText("no튀김");
                break;
            case "01":
                btn1.setText("돈많음");
                btn2.setText("그지");
                break;
            case "10":
                btn1.setText("매콤");
                btn2.setText("안매운거");
                break;
            case "11":
                btn1.setText("국물O");
                btn2.setText("국물X");
                break;
            case "000":
                startActivityForResult(intent,0);
                s1="치킨";
                break;
            case "001":
                startActivityForResult(intent,0);
                s1="찜닭";
                break;
            case "010":
                startActivityForResult(intent,0);
                s1="소고기";
                break;
            case "011":
                startActivityForResult(intent,0);
                s1="돼지고기";
                break;
            case "100":
                startActivityForResult(intent,0);
                s1="라멘";
                break;
            case "101":
                startActivityForResult(intent,0);
                s1="우동";
                break;
            case "110":
                startActivityForResult(intent,0);
                s1="찌개";
                break;
            case "111":
                startActivityForResult(intent,0);
                s1="백반";
                break;

            default:
                break;

        }


    }
}

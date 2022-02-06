//6206021611109 ณัฐชนน ต่างใจ
package com.example.additionnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button calNum;
    private TextView resSum;
    private TextView resMin;
    private TextView resMax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        calNum = (Button) findViewById(R.id.calNum);
        resSum = (TextView) findViewById(R.id.resSum);
        resMin = (TextView) findViewById(R.id.resMin);
        resMax = (TextView) findViewById(R.id.resMax);

        calNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = num1.getText().toString();
                String text2 = num2.getText().toString();
                if(text1.matches("")){
                    Toast.makeText(MainActivity.this, "Type Number on Number 1",Toast.LENGTH_LONG).show();
                    return;
                }
                if(text2.matches("")){
                    Toast.makeText(MainActivity.this, "Type Number on Number 2",Toast.LENGTH_LONG).show();
                    return;
                }
                calNumFun(text1, text2);
            }
        });
    }
    private void calNumFun(String text1 , String text2){
        int res = Integer.parseInt(text1) + Integer.parseInt(text2);
        String temp = Integer.toString(res);
        calMinFun(text1,text2);
        calMaxFun(text1,text2);
        resSum.setText(temp);
    }
    private void calMinFun(String text1 , String text2){
        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int min;
        if(num1 < num2)min = num1;
        else min = num2;
        String temp = Integer.toString(min);
        resMin.setText(temp);
    }
    private void calMaxFun(String text1 , String text2){
        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int max;
        if(num1 > num2)max = num1;
        else max = num2;
        String temp = Integer.toString(max);
        resMax.setText(temp);
    }
}


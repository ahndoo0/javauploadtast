package com.android.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Edit1 = null;
    private EditText Edit2 = null;
    private Button BtnA =null;
    private Button BtnS = null;
    private Button BtnM = null;
    private Button BtnD = null;
    private Button BtnR = null;
    private TextView Result = null;
    private int num1=0;
    private int num2=0;
    int rs=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기 ");

        BtnA = findViewById(R.id.BtnA);
        BtnS = findViewById(R.id.BtnS);
        BtnM = findViewById(R.id.BtnM);
        BtnD = findViewById(R.id.BtnD);
        BtnR = findViewById(R.id.BtnR);
        Edit1 = findViewById(R.id.Edit1);
        Edit2 = findViewById(R.id.Edit2);
        Result = findViewById(R.id.Result);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(Edit1.getText().toString());
                num2 = Integer.parseInt(Edit2.getText().toString());

                    if (view.getId() == R.id.BtnA) {
                        rs = num1 + num2;
                        Result.setText("계산결과: " + rs);
                    } else if (view.getId() == R.id.BtnS) {
                        rs = num1 - num2;
                        Result.setText("계산결과: " + rs);
                    } else if (view.getId() == R.id.BtnM) {
                        rs = num1 * num2;
                        Result.setText("계산결과: " + rs);
                    } else if (view.getId() == R.id.BtnD) {
                        if (Edit2.equals(null) || num2 == 0) {
                            Toast.makeText(getApplicationContext(), "0입니다", Toast.LENGTH_SHORT).show();
                        } else {
                            rs = num1 / num2;
                            Result.setText("계산결과: " + (double) rs);
                        }
                    } else if (view.getId() == R.id.BtnR) {
                        rs = num1 % num2;
                        Result.setText("계산결과: " + rs);
                    }

                }

        };
        BtnA.setOnClickListener(clickListener);
        BtnS.setOnClickListener(clickListener);
        BtnM.setOnClickListener(clickListener);
        BtnD.setOnClickListener(clickListener);
        BtnR.setOnClickListener(clickListener);


    }
}

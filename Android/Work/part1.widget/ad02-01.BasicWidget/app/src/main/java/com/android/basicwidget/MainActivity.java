package com.android.basicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "button1", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),RadioActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "button2", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),WidhtActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "button3", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),HeigthActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"button4",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),ColorActivity.class);
                startActivity(intent);
             }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"button5",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MarginActivity.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"button6",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),PaddingActivity.class);
                startActivity(intent);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"button7",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),VisibleActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.android.senddata;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    private EditText ems = null;
    private Button send = null;
    private TextView text = null;
    private Button but2 = null;
    private Button but3 = null;
    private Button but4 = null;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ems = findViewById(R.id.ems);
        send = findViewById(R.id.Send);
        text = findViewById(R.id.text);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String tmp = ems.getText().toString();
               text.setText(tmp);
            }
        });
        but2 = findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"토스트",Toast.LENGTH_SHORT).show();
            }
        });
        but3 = findViewById(R.id.but3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent but3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr"));
            startActivity(but3);
            }
        });
        but4 = findViewById(R.id.but4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent but4 = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:"));
                startActivity(but4);
            }
        });

    }
}

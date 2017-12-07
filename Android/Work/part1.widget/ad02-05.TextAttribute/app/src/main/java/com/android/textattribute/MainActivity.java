package com.android.textattribute;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text1 = null;
    private TextView text2 = null;
    private TextView text3 = null;
    private TextView text4 = null;
    private TextView text5 = null;
    private TextView text6 = null;
    private Button   button= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTitle("텍스트 속성 변경 후");
                setTitle(R.string.app_name2);
                text1.setTextSize(50);
                text2.setTextColor(Color.BLUE);
                text3.setTypeface(text3.getTypeface(),Typeface.BOLD_ITALIC);

            }
        });

    }
}

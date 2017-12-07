package com.android.eventlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button1 = null;
    private Button button3 = null;
    private Button button4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //방법1. anonymouse 클래스로 리스너 만들기(필드선언 필요함 , 아이디 찾기 필요함 )
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "무명 클래스 리스너", Toast.LENGTH_SHORT).show();

            }
        });
        //방법3. 내부 클래스 리스너 ( 클래스 선언 해줘야하고, 필드 선언 해줘야함 ,아디도 찾아야함)
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new innerclass());
        //방법4. IMPLEMENT 리스너
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }
    //방법2.  인라인 리스너  (필드선언 안해도됨. 레이아웃에 선언 만해주면됨)
    public void inlineclick(View view) {
        Toast.makeText(getApplicationContext(),"인라인 리스너",Toast.LENGTH_SHORT).show();

    }
    //방법4. IMPLEMENT 리스너
    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"IMPLEMENT 리스너",Toast.LENGTH_SHORT).show();
    }

    //방법3. 내부 클래스 리스너
    private class innerclass implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"내부 클래스 리스너",Toast.LENGTH_SHORT).show();

        }
    }
}

package com.android.compoundwidget;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.View;
        import android.widget.LinearLayout;
        import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rgpDirection = null;
    private RadioGroup rgpGravity = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgpDirection = findViewById(R.id.rgpDirection);
        rgpDirection.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.radioH){
                    rgpDirection.setOrientation(LinearLayout.HORIZONTAL);
                }
                else if (checkedId == R.id.radioV){
                    rgpDirection.setOrientation(LinearLayout.VERTICAL);
                }
            }
        });
        rgpGravity = findViewById(R.id.rgpGravity);
        rgpGravity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radioLeft){
                    rgpGravity.setGravity(Gravity.LEFT);
                }
                else if (i == R.id.radioCenter){
                    rgpGravity.setGravity(Gravity.CENTER);
                }
                else if (i == R.id.radioRigth){
                    rgpGravity.setGravity(Gravity.RIGHT);
                }

            }
        });
    }
}

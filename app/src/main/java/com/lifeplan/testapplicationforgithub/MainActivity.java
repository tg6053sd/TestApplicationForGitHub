package com.lifeplan.testapplicationforgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // region field

    // カウント
    int count = 0;

    // endregion

    // region event

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count += 1;
                TextView textView = findViewById(R.id.textView);
                textView.setText(String.valueOf(count) + "回目");
            }
        });
    }

    // endregion
}

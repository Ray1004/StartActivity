package com.example.elegy1004.startactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by elegy1004 on 2018/4/12.
 */

public class AnotherActivity extends Activity {
    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        button = (Button)findViewById(R.id.button1);
        textView = (TextView)findViewById(R.id.textView1);

        Intent intent = getIntent();

        final String message = intent.getStringExtra("message").toString();
        textView.setText(message);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                String textView=intent.getStringExtra("message");

                intent.putExtra("result", message);
                setResult(0, intent);

                finish();
            }
        });
    }
}

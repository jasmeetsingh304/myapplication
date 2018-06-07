package com.example.jasmeetsingh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    TextView textView1;
    TextView textView2;
    EditText editText1;
    EditText editText2;
    Button button1;
    Integer num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        button1 = (Button)findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                sum = num1+num2;

                textView2.setText(Integer.toString(sum));

            }
        });



    }


}

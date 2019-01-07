package com.example.asus.challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int sayac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = (TextView)findViewById(R.id.sayac);
        if(savedInstanceState!=null)
        {
            sayac=savedInstanceState.getInt("sayac");
            tv.setText("Sayaç:"+sayac);
        }
        else
        {
            sayac=0;
        }


        ((Button) findViewById(R.id.arttır1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = getIntent();

                sayac=sayac+1;
                tv.setText("Sayaç:"+sayac);

                startActivity(a);
            }
        });
        ((Button) findViewById(R.id.arttır2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = getIntent();

                sayac=sayac+2;
                tv.setText("Sayaç:"+sayac);

                startActivity(i);
            }
        });
        ((Button) findViewById(R.id.sıfırla)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = getIntent();

                sayac=0;
                tv.setText("Sayaç:"+sayac);

                startActivity(b);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("sayac",sayac);
    }
}

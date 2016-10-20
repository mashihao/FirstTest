package com.example.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.uilibrary.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button but1 = null;
    Button but2 = null;
    Button but3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test);
        initView();
    }

    private void initView() {
        but1 = (Button) findViewById(R.id._bt_1);
        but2 = (Button) findViewById(R.id._bt_2);
        but3 = (Button) findViewById(R.id._bt_3);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id._bt_1:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                break;
            case R.id._bt_2:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
            case R.id._bt_3:
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

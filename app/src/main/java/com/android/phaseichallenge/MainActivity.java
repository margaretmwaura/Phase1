package com.android.phaseichallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_b)
    Button openActivityB;
    @BindView(R.id.activity_C)
    Button openActivityC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.activity_b)
    public void setOpenActivityB(View view)
    {
        Intent intent = new Intent(MainActivity.this , ActivityB.class);
        startActivity(intent);
    }

    @OnClick(R.id.activity_C)
    public void setOpenActivityC(View view)
    {
        Intent intent = new Intent(MainActivity.this , ActivityC.class);
        startActivity(intent);
    }
}

package com.hhd2002.myandapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MyMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.my_main_activity);

        this.findViewById(R.id.btn_qr_read).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _onClick_btn_qr_read();
            }
        });

        this.findViewById(R.id.btn_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _onClick_btn_clear();
            }
        });
    }

    private void _onClick_btn_clear() {
    }

    private void _onClick_btn_qr_read() {
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

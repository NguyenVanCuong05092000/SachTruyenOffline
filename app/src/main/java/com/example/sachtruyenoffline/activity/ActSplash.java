package com.example.sachtruyenoffline.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sachtruyenoffline.R;

public class ActSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_chao);
    }

    public void ActHome(View view) {
        Intent intent = new Intent(this, ActMain.class);
        startActivity(intent);
    }
}

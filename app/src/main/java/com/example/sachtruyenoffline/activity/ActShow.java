package com.example.sachtruyenoffline.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.sachtruyenoffline.R;

public class ActShow extends AppCompatActivity {
LinearLayout lnShow;
RelativeLayout MenuTop, MenuBotton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_show);
        lnShow = findViewById(R.id.lnShow);
        MenuBotton = findViewById(R.id.menuBotton);
        MenuTop = findViewById(R.id.MenuTop);



        lnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuBotton.getVisibility() != View.VISIBLE && MenuTop.getVisibility()!=View.VISIBLE) {
                    MenuBotton.setVisibility(View.VISIBLE);
                    MenuTop.setVisibility(View.VISIBLE);

                } else {
                    MenuBotton.setVisibility(View.GONE);
                    MenuTop.setVisibility(View.GONE);
                }
            }
        });
    }
}

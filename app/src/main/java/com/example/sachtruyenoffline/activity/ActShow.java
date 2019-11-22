package com.example.sachtruyenoffline.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sachtruyenoffline.R;

import static com.example.sachtruyenoffline.R.color.WhiteColor;
import static com.example.sachtruyenoffline.R.color.BlackColor;
import static com.example.sachtruyenoffline.R.color.VangColor;
import static com.example.sachtruyenoffline.R.color.XamColor;

public class ActShow extends AppCompatActivity {
LinearLayout lnShow;
TextView tvDoc;
RelativeLayout MenuTop, MenuBotton;
RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_show);
        lnShow = findViewById(R.id.lnShow);
        MenuBotton = findViewById(R.id.menuBotton);
        MenuTop = findViewById(R.id.MenuTop);
        radioGroup = findViewById(R.id.groupRadio);
        tvDoc = findViewById(R.id.tvDoc);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rdBtnTrang:
                        lnShow.setBackgroundColor(0xffffffff);
                        tvDoc.setTextColor(0xff000000);
                        break;
                    case R.id.rdBtnVang:
                        lnShow.setBackgroundColor(0xffffff00);
                        tvDoc.setTextColor(0xff000000);
                        break;
                    case R.id.rdBtnXam:
                        lnShow.setBackgroundColor(0xff000000);
                        tvDoc.setTextColor(0xffffffff);
                        break;

                }
            }
        });



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

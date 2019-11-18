package com.example.sachtruyenoffline.activity;

import android.os.Bundle;

import com.example.sachtruyenoffline.R;
import com.example.sachtruyenoffline.adapter.MyFragmentAdapter;
import com.example.sachtruyenoffline.fragment.FrmSach;
import com.example.sachtruyenoffline.fragment.FrmTruyen;
import com.example.sachtruyenoffline.fragment.FrmYeuthich;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Main2Activity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    RelativeLayout lblSachTHSub, lblSachKHSub, lblSachKDSub, lblSachTYSub, lblSachHKSub, lblTruyenTHSub, lblTruyenCuoiSub, lblTruyenKHSub, lbltruyenVNsub;
    LinearLayout subSachTH, lnSubKhoaHoc, lnSubKD, lnSubTY, lnSubHK, lnTruyenTH, lnSubTruyenCuoi, lnSubTruyenKH, lnSubTruyenVN;
    ImageView imgMuitenSachTH, imgMuttenSachKH, imgMiuTenSachKD, imgMuiTenSachTY, imgMuiTenSachHK, imgMuiTenTruyenTH, imgMuiTenTruyenCuoi,imgMuiTenTruyenKH,imgMuiTenTruyenVN ;
    private AppBarConfiguration.OnNavigateUpListener mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tabLayout = findViewById(R.id.tabHome);
        viewPager = findViewById(R.id.viewPagerHome);
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new FrmSach(), "Sách");
        adapter.addFragment(new FrmTruyen(), "Truyện");
        adapter.addFragment(new FrmYeuthich(), "Yêu thích");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        mAppBarConfiguration = new AppBarConfiguration.OnNavigateUpListener() {
            @Override
            public boolean onNavigateUp() {
                return false;
            }
        };


        imgMuitenSachTH = findViewById(R.id.imgMuitenSachTH);
        imgMuttenSachKH = findViewById(R.id.imgMuttenSachKH);
        imgMiuTenSachKD = findViewById(R.id.imgMiuTenSachKD);
        imgMuiTenSachTY = findViewById(R.id.imgMuiTenSachTY);
        imgMuiTenSachHK = findViewById(R.id.imgMuiTenSachHK);




        lblSachTHSub = findViewById(R.id.lblSachTHSub);
        lblSachKHSub = findViewById(R.id.lblSachKHSub);
        lblSachKDSub = findViewById(R.id.lblSachKDSub);
        lblSachTYSub = findViewById(R.id.lblSachTYSub);
        lblSachHKSub = findViewById(R.id.lblSachHKSub);




        subSachTH = findViewById(R.id.subSachTH);
        subSachTH.setVisibility(View.GONE);
        lnSubKhoaHoc = findViewById(R.id.lnSubKhoaHoc);
        lnSubKhoaHoc.setVisibility(View.GONE);
        lnSubKD = findViewById(R.id.lnSubKD);
        lnSubKD.setVisibility(View.GONE);
        lnSubTY = findViewById(R.id.lnSubTY);
        lnSubTY.setVisibility(View.GONE);
        lnSubHK = findViewById(R.id.lnSubHK);
        lnSubHK.setVisibility(View.GONE);



        lblSachKHSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnSubKhoaHoc.getVisibility() != View.VISIBLE) {
                    lnSubKhoaHoc.setVisibility(View.VISIBLE);
                    imgMuttenSachKH.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    lnSubKhoaHoc.setVisibility(View.GONE);
                    imgMuttenSachKH.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });


        lblSachTHSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subSachTH.getVisibility() != View.VISIBLE) {
                    subSachTH.setVisibility(View.VISIBLE);
                    imgMuitenSachTH.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    subSachTH.setVisibility(View.GONE);
                    imgMuitenSachTH.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });


        lblSachKDSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnSubKD.getVisibility() != View.VISIBLE) {
                    lnSubKD.setVisibility(View.VISIBLE);
                    imgMiuTenSachKD.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    lnSubKD.setVisibility(View.GONE);
                    imgMiuTenSachKD.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });


        lblSachTYSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnSubTY.getVisibility() != View.VISIBLE) {
                    lnSubTY.setVisibility(View.VISIBLE);
                    imgMuiTenSachTY.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    lnSubTY.setVisibility(View.GONE);
                    imgMuiTenSachTY.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });
        lblSachHKSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnSubHK.getVisibility() != View.VISIBLE) {
                    lnSubHK.setVisibility(View.VISIBLE);
                    imgMuiTenSachHK.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    lnSubHK.setVisibility(View.GONE);
                    imgMuiTenSachHK.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });


        lblTruyenTHSub = findViewById(R.id.lblTruyenTHSub);
        lblTruyenCuoiSub = findViewById(R.id.lblTruyenCuoiSub);
        lblTruyenKHSub = findViewById(R.id.lblTruyenKHSub);
        lbltruyenVNsub = findViewById(R.id.lbltruyenVNsub);

        lnTruyenTH = findViewById(R.id.lnTruyenTH);
        lnTruyenTH.setVisibility(View.GONE);
        lnSubTruyenCuoi = findViewById(R.id.lnSubTruyenCuoi);
        lnSubTruyenCuoi.setVisibility(View.GONE);
        lnSubTruyenKH = findViewById(R.id.lnSubTruyenKH);
        lnSubTruyenKH.setVisibility(View.GONE);
        lnSubTruyenVN = findViewById(R.id.lnSubTruyenVN);
        lnSubTruyenVN.setVisibility(View.GONE);

        imgMuiTenTruyenTH = findViewById(R.id.imgMuiTenTruyenTH);
        imgMuiTenTruyenCuoi = findViewById(R.id.imgMuiTenTruyenCuoi);
        imgMuiTenTruyenKH = findViewById(R.id.imgMuiTenTruyenKH);
        imgMuiTenTruyenVN = findViewById(R.id.imgMuiTenTruyenVN);

        lblTruyenTHSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnTruyenTH.getVisibility() != View.VISIBLE) {
                    lnTruyenTH.setVisibility(View.VISIBLE);
                    imgMuiTenTruyenTH.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    lnTruyenTH.setVisibility(View.GONE);
                    imgMuiTenTruyenTH.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });
        lblTruyenCuoiSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnSubTruyenCuoi.getVisibility() != View.VISIBLE) {
                    lnSubTruyenCuoi.setVisibility(View.VISIBLE);
                    imgMuiTenTruyenCuoi.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    lnSubTruyenCuoi.setVisibility(View.GONE);
                    imgMuiTenTruyenCuoi.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });
        lblTruyenKHSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnSubTruyenKH.getVisibility() != View.VISIBLE) {
                    lnSubTruyenKH.setVisibility(View.VISIBLE);
                    imgMuiTenTruyenKH.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    lnSubTruyenKH.setVisibility(View.GONE);
                    imgMuiTenTruyenKH.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });
        lbltruyenVNsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnSubTruyenVN.getVisibility() != View.VISIBLE) {
                    lnSubTruyenVN.setVisibility(View.VISIBLE);
                    imgMuiTenTruyenVN.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    lnSubTruyenVN.setVisibility(View.GONE);
                    imgMuiTenTruyenVN.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });



    }





    public void menu(View view) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            drawer.openDrawer(GravityCompat.START);
        }
    }

}

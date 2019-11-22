package com.example.sachtruyenoffline.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.sachtruyenoffline.R;
import com.example.sachtruyenoffline.moder.MucLuc;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ActInformation extends AppCompatActivity {
    List<MucLuc> mucLucList;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_information2);



        mucLucList = new ArrayList<>();
        mucLucList.add(new MucLuc("Mục 1","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 2","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 3","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 4","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 5","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 6","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 7","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 8","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 9","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 10","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 11","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 12","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 13","Muốn lấy mật ong đừng phá tổ"));
        mucLucList.add(new MucLuc("Mục 14","Muốn lấy mật ong đừng phá tổ"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView = findViewById(R.id.ryMucLuc);
        MucLucAdapter mucLucAdapter = new MucLucAdapter(this,mucLucList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mucLucAdapter);

}


}

package com.example.sachtruyenoffline.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sachtruyenoffline.R;
import com.example.sachtruyenoffline.activity.ActInformation;
import com.example.sachtruyenoffline.moder.Sach;
import com.example.sachtruyenoffline.moder.SachKhoaHoc;
import com.example.sachtruyenoffline.moder.Truyen;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class TruyenAdapter extends RecyclerView.Adapter<TruyenAdapter.MyRecycleview> {
private Context mContext;
private List<Truyen> truyenList;
private List<SachKhoaHoc> sachKhoaHocList;

    public TruyenAdapter(Context mContext, List<Truyen> truyenListt) {
        this.mContext = mContext;
        this.truyenList = truyenListt;
    }

    @NonNull
    @Override
    public MyRecycleview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.row_list_sach,parent,false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ActInformation.class);
                mContext.startActivity(intent);
            }
        });

        return new MyRecycleview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecycleview holder, int position) {

        Truyen truyen = truyenList.get(position);

        holder.tv_Name.setText(truyenList.get(position).getNameSach());
        Picasso.with(mContext).load(truyen.anh).into(holder.anh);


    }

    @Override
    public int getItemCount() {
        return truyenList.size();
    }

    public class MyRecycleview extends RecyclerView.ViewHolder{
        TextView tv_Name;
        ImageView anh;


        public MyRecycleview(@NonNull View itemView) {
            super(itemView);
            anh = (ImageView) itemView.findViewById(R.id.imgAvataSach);
            tv_Name = (TextView)  itemView.findViewById(R.id.tvNamesach);



        }
    }

}

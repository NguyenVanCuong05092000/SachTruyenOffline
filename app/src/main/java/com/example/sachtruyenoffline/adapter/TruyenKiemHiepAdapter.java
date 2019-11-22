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
import com.example.sachtruyenoffline.moder.SachKhoaHoc;
import com.example.sachtruyenoffline.moder.Truyen;
import com.example.sachtruyenoffline.moder.TruyenKiemHiep;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class TruyenKiemHiepAdapter extends RecyclerView.Adapter<TruyenKiemHiepAdapter.MyRecycleview> {
private Context mContext;
private List<TruyenKiemHiep> truyenKiemHiepList;


    public TruyenKiemHiepAdapter(Context mContext, List<TruyenKiemHiep> truyenKiemHiepList) {
        this.mContext = mContext;
        this.truyenKiemHiepList = truyenKiemHiepList;

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

        TruyenKiemHiep truyenKiemHiep = truyenKiemHiepList.get(position);

        holder.tv_Name.setText(truyenKiemHiepList.get(position).getNameSach());
        Picasso.with(mContext).load(truyenKiemHiep.anh).into(holder.anh);


    }

    @Override
    public int getItemCount() {
        return truyenKiemHiepList.size();
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

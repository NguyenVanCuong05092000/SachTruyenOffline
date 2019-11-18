package com.example.sachtruyenoffline.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sachtruyenoffline.R;
import com.example.sachtruyenoffline.moder.Sach;
import com.example.sachtruyenoffline.moder.SachKhoaHoc;
import com.example.sachtruyenoffline.moder.SachTinhyeu;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class SachTinhYeuAdapter extends RecyclerView.Adapter<SachTinhYeuAdapter.MyRecycleview> {
private Context mContext;
private List<SachTinhyeu> sachTinhyeuList;


    public SachTinhYeuAdapter(Context mContext, List<SachTinhyeu> sachTinhyeuList) {
        this.mContext = mContext;
        this.sachTinhyeuList = sachTinhyeuList;
    }

    @NonNull
    @Override
    public MyRecycleview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.row_list_sach,parent,false);

        return new MyRecycleview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecycleview holder, int position) {

        SachTinhyeu sachTinhyeu = sachTinhyeuList.get(position);

        holder.tv_Name.setText(sachTinhyeuList.get(position).getNameSach());
        Picasso.with(mContext).load(sachTinhyeu.anh).into(holder.anh);


    }

    @Override
    public int getItemCount() {
        return sachTinhyeuList.size();
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
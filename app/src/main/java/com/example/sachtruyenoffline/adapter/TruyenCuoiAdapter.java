package com.example.sachtruyenoffline.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sachtruyenoffline.R;
import com.example.sachtruyenoffline.moder.SachKhoaHoc;
import com.example.sachtruyenoffline.moder.Truyen;
import com.example.sachtruyenoffline.moder.TruyenCuoi;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class TruyenCuoiAdapter extends RecyclerView.Adapter<TruyenCuoiAdapter.MyRecycleview> {
private Context mContext;
private List<TruyenCuoi> truyenCuoiList;


    public TruyenCuoiAdapter(Context mContext, List<TruyenCuoi> truyenCuoiList) {
        this.mContext = mContext;
        this.truyenCuoiList = truyenCuoiList;
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

        TruyenCuoi truyenCuoi = truyenCuoiList.get(position);

        holder.tv_Name.setText(truyenCuoiList.get(position).getNameSach());
        Picasso.with(mContext).load(truyenCuoi.anh).into(holder.anh);


    }

    @Override
    public int getItemCount() {
        return truyenCuoiList.size();
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

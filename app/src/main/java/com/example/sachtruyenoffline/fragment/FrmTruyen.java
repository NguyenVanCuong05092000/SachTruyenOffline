package com.example.sachtruyenoffline.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sachtruyenoffline.R;
import com.example.sachtruyenoffline.adapter.TruyenAdapter;
import com.example.sachtruyenoffline.adapter.TruyenCuoiAdapter;
import com.example.sachtruyenoffline.adapter.TruyenKiemHiepAdapter;
import com.example.sachtruyenoffline.adapter.TruyenVietNamAdapter;
import com.example.sachtruyenoffline.database.ListDanhSachDAO;
import com.example.sachtruyenoffline.entity.Truyen;
import com.example.sachtruyenoffline.entity.TruyenCuoi;
import com.example.sachtruyenoffline.entity.TruyenKiemHiep;
import com.example.sachtruyenoffline.entity.TruyenVietNam;

import java.util.List;


public class FrmTruyen extends Fragment {
    List<Truyen> truyenList;
    List<TruyenCuoi> truyenCuoiList;
    List<TruyenKiemHiep> truyenKiemHiepList;
    List<TruyenVietNam> truyenVietNamList;
    ListDanhSachDAO listDanhSachDAO;

    public FrmTruyen() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frm_truyen, container, false);
//Truyện tổng hợp
        listDanhSachDAO = new ListDanhSachDAO(getContext());
        truyenList = listDanhSachDAO.getALLTruyen();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ryTruyen);
        TruyenAdapter truyenAdapter = new TruyenAdapter(getContext(), truyenList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(truyenAdapter);

//Truyện cười
        listDanhSachDAO = new ListDanhSachDAO(getContext());
        truyenCuoiList = listDanhSachDAO.getALLTruyencuoi();
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView1 = view.findViewById(R.id.ryTruyenCuoi);
        TruyenCuoiAdapter truyenCuoiAdapter = new TruyenCuoiAdapter(getContext(), truyenCuoiList);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView1.setAdapter(truyenCuoiAdapter);


//Truyện kiếm hiệp
        listDanhSachDAO = new ListDanhSachDAO(getContext());
        truyenKiemHiepList = listDanhSachDAO.getALLTruyenKiemHiep();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView2 = view.findViewById(R.id.ryTruyenKiemHiep);
        TruyenKiemHiepAdapter truyenKiemHiepAdapter = new TruyenKiemHiepAdapter(getContext(),truyenKiemHiepList);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setAdapter(truyenKiemHiepAdapter);


//Truyện Việt Nam
        listDanhSachDAO = new ListDanhSachDAO(getContext());
        truyenVietNamList = listDanhSachDAO.getALLTruyenVietNam();
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView3 = view.findViewById(R.id.ryTruyenVietNam);
        TruyenVietNamAdapter truyenVietNamAdapter = new TruyenVietNamAdapter(getContext(),truyenVietNamList);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView3.setAdapter(truyenVietNamAdapter);
        return view;
    }


}

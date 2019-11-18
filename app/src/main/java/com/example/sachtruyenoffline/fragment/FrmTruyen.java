package com.example.sachtruyenoffline.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sachtruyenoffline.R;
import com.example.sachtruyenoffline.adapter.SachAdapter;
import com.example.sachtruyenoffline.adapter.TruyenAdapter;
import com.example.sachtruyenoffline.adapter.TruyenCuoiAdapter;
import com.example.sachtruyenoffline.adapter.TruyenKiemHiepAdapter;
import com.example.sachtruyenoffline.adapter.TruyenVietNamAdapter;
import com.example.sachtruyenoffline.moder.Truyen;
import com.example.sachtruyenoffline.moder.TruyenCuoi;
import com.example.sachtruyenoffline.moder.TruyenKiemHiep;
import com.example.sachtruyenoffline.moder.TruyenVietNam;

import java.util.ArrayList;
import java.util.List;


public class FrmTruyen extends Fragment {
    List<Truyen> truyenList;
    List<TruyenCuoi> truyenCuoiList;
    List<TruyenKiemHiep> truyenKiemHiepList;
    List<TruyenVietNam> truyenVietNamList;

    public FrmTruyen() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frm_truyen, container, false);
//Truyện tổng hợp
        truyenList = new ArrayList<>();

        truyenList.add(new Truyen("Bố già", "https://newshop.vn/public/uploads/products/4381/bo-gia.gif"));
        truyenList.add(new Truyen("Không gia đình", "https://isach.net/wp-content/uploads/2017/03/khong-gia-dinh.jpg"));
        truyenList.add(new Truyen("Tiếng chim hót trong bụi mần gia", "https://www.khaitam.com/Data/Sites/1/Product/1387/tieng-chim-hot-trong-bui-man-gai.jpg"));
        truyenList.add(new Truyen("Thép đã tôi thế đấy", "https://pibook.vn/uploads/products/63822_29_08_15_thep-da-toi-the-day.gif"));
        truyenList.add(new Truyen("Nhà kim giả", "https://tiki.vn/tu-van/wp-content/uploads/2016/07/nha-gia-kim.jpg"));
        truyenList.add(new Truyen("Đồi gió hú", "https://tiki.vn/tu-van/wp-content/uploads/2015/05/img135.gif"));
        truyenList.add(new Truyen("Ruồi trâu", "https://bigdream.vn/image/cache/data/book/sac-mau-cuoc-song/vh-nuoc-ngoai/ruoi-trau/ruoi-trau-700x1000.jpg"));
        truyenList.add(new Truyen("Cuốn theo chiều gió", "https://www.taisachhay.com/wp-content/uploads/2015/09/cuon-theo-chieu-gio.jpg"));
        truyenList.add(new Truyen("Từ thăm thẳm lãng quên", "https://1tach.com/data/news/1803/09-tu-tham-tham-lang-quen-1tach.com.jpg"));
        truyenList.add(new Truyen("Tiếng gọi nơi hoang giã", "https://static.truyenfull.vn/cover/o/eJzLyTDW1821yDI2KzX3q4oK1Q-r9PWzTHPLjEz01HeEAr94A32XANOo4KBKS4MoX7_UTE-voDJTC11vJ--UxFyzgLKQDEdn53z9ciNDU90MYyMjAIY_GfA=/tieng-goi-noi-hoang-da-phuong-bac.jpg"));
        truyenList.add(new Truyen("Nhà thờ Đức Bà Paris", "https://gacsach.com/sites/gacsach.com/files/styles/book310/public/nha-tho-duc-ba-paris.jpg?itok=sRpddPak"));
        truyenList.add(new Truyen("Hoa tulip đen", "https://i0.wp.com/downloadsachmienphi.com/wp-content/uploads/2018/09/hoa-tu-lip-den-202x300.jpg?fit=200%2C297&ssl=1"));
        truyenList.add(new Truyen("Thiên Thần và ác quỷ", "https://static.truyenfull.vn/cover/o/eJzLyTDW1zX3TktzcvJIMilN1w-rcEr0rHIrK_T11HeEAr-sYn2_cm-DgHx_i3SfZEMj_yBHk1QTp4rCCBNXwwrziqzSNEdn53z9ciNDU90MYyMjXc9kEyMAKtQbzQ==/thien-than-va-ac-quy.jpg"));
        truyenList.add(new Truyen("Biểu tượng thất truyền", "https://static.macawshop.com/epubvn-image/optimized-cover-1544981119330-cover.jpg"));
        truyenList.add(new Truyen("Mật mã Maya", "https://sachvui.com/cover/2015/Mat-Ma-Maya.jpg"));
        truyenList.add(new Truyen("Bên rặng Tuyết sơn", "https://sachnoionline.net/upload/book/2412.jpg"));
        truyenList.add(new Truyen("Hội hè miên man", "https://webtruyen.com/public/images/hoihemienmanxXioMK4MvB.jpg"));
        truyenList.add(new Truyen("Rừng Nauy", "https://tse4.mm.bing.net/th?id=OIP.jUkRhq3pEXwqK536J6aWJgDTEm&pid=Api&P=0&w=300&h=300"));
        truyenList.add(new Truyen("Giết con chim nhạn", "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2019/08/giet-con-chim-nhai-0-700x1024.jpg?fit=700%2C20000&quality=95&ssl=1"));
        truyenList.add(new Truyen("Thành phố trộm", "http://300b5338.vws.vegacdn.vn/image/img.book/0/0/0/1899.jpg?v=1&w=530&h=360&nocache=1"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ryTruyen);
        TruyenAdapter truyenAdapter = new TruyenAdapter(getContext(), truyenList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(truyenAdapter);

//Truyện cười

        truyenCuoiList = new ArrayList<>();
        truyenCuoiList.add(new TruyenCuoi("Trạng Quỳnh", "http://pandabooks.vn/image/cache/catalog/Sach-Van-Hoc/truyen-trang-quynh-650x650.jpg"));
        truyenCuoiList.add(new TruyenCuoi("Truyện cười dân gian Viêt Nam", "http://img2.phanmem32.com/4/truyen-cuoi-dan-gian-viet-nam/truyen-cuoi-dan-gian-viet-nam-3.jpg"));
        truyenCuoiList.add(new TruyenCuoi("Truyện cười Vova", "https://3.bp.blogspot.com/-ILh5ZpZLUeo/WL6YudrRDuI/AAAAAAAACkc/JCjw_0WRhCoLVDsS1VCg_qAEUpFbGFq1wCLcB/s1600/tuyen-tap-truyen-cuoi-vova.jpg"));
        truyenCuoiList.add(new TruyenCuoi("Truyện Xiển Bột", "https://sachvui.com/cover2/2015/Truyen-Xien-Bot.jpg"));
        truyenCuoiList.add(new TruyenCuoi("Tiếng cười bác Ba Phi", "https://vcdn.tikicdn.com/cache/550x550/media/catalog/product/i/m/img851.u2469.d20160916.t095134.573923.jpg"));
        truyenCuoiList.add(new TruyenCuoi("Ba giai tú xuất", "https://sachvui.com/cover/2015/Ba-Giai---Tu-Xuat.jpg"));
        truyenCuoiList.add(new TruyenCuoi("Truyện trạng lợn", "https://www.fahasa.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/i/m/image_142277.jpg"));


        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView1 = view.findViewById(R.id.ryTruyenCuoi);
        TruyenCuoiAdapter truyenCuoiAdapter = new TruyenCuoiAdapter(getContext(), truyenCuoiList);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView1.setAdapter(truyenCuoiAdapter);


//Truyện kiếm hiệp
        truyenKiemHiepList = new ArrayList<>();
        truyenKiemHiepList.add(new TruyenKiemHiep("Anh hùng xạ điêu", "https://img.congtruyen.org/uploads/anh-hung-xa-dieu.jpg"));
        truyenKiemHiepList.add(new TruyenKiemHiep("Bích huyết kiếm", "https://audiotruyen.org/wp-content/uploads/2012/07/bich-huyet-kiem.jpg"));
        truyenKiemHiepList.add(new TruyenKiemHiep("Ỷ thiên đồ long ký", "https://audiovyvy.com/wp-content/uploads/2018/07/truyen-y-thien-do-long-ki.jpg"));
        truyenKiemHiepList.add(new TruyenKiemHiep("Thần điêu đại hiệp", "https://truyenaudio.org/upload/pro/Than-dieu-dai-hiep-truyen-audio-kiem-hiep.jpg?quality=100&mode=crop&anchor=topleft&width=300&height=450"));

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView2 = view.findViewById(R.id.ryTruyenKiemHiep);
        TruyenKiemHiepAdapter truyenKiemHiepAdapter = new TruyenKiemHiepAdapter(getContext(),truyenKiemHiepList);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setAdapter(truyenKiemHiepAdapter);


//Truyện Việt Nam
        truyenVietNamList = new ArrayList<>();
        truyenVietNamList.add(new TruyenVietNam("Dế mèn phiêu lưu ký","https://www.taisachhay.com/wp-content/uploads/2016/03/de-men-phieu-luu-ky-to-hoai.jpg"));
        truyenVietNamList.add(new TruyenVietNam("Đất rừng phương nam","https://upload.wikimedia.org/wikipedia/vi/thumb/3/35/Dat_Rung_Phuong_Nam.gif/220px-Dat_Rung_Phuong_Nam.gif"));
        truyenVietNamList.add(new TruyenVietNam("Chị ơi...Anh yêu em","https://thichdoctruyen.com/images/thumb/1444712815382-chi-oi-anh-yeu-em.jpg"));
        truyenVietNamList.add(new TruyenVietNam("Những ngày thơ ấu","https://vcdn.tikicdn.com/media/catalog/product/i/m/img478_9.jpg"));
        truyenVietNamList.add(new TruyenVietNam("Cho tôi xin một vé đi tuổi thơ","https://pibook.vn/uploads/products/34079_10_10_15_cho-toi-xin-mot-ve-di-tuoi-tho-tai-ban-2015.gif"));
        truyenVietNamList.add(new TruyenVietNam("Cô gái đến từ hôm qua","https://www.fahasa.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/c/o/co_gai_den_tu_hom_qua_1_2018_11_16_11_03_46.JPG"));


        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);

        RecyclerView recyclerView3 = view.findViewById(R.id.ryTruyenVietNam);
        TruyenVietNamAdapter truyenVietNamAdapter = new TruyenVietNamAdapter(getContext(),truyenVietNamList);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView3.setAdapter(truyenVietNamAdapter);
        return view;
    }


}

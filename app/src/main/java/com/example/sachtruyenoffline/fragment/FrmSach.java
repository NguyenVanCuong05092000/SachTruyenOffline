package com.example.sachtruyenoffline.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.sachtruyenoffline.R;
import com.example.sachtruyenoffline.adapter.SachAdapter;
import com.example.sachtruyenoffline.adapter.SachHoiKyAdapter;
import com.example.sachtruyenoffline.adapter.SachKhoaHocAdapter;
import com.example.sachtruyenoffline.adapter.SachKinhDoanhAdapter;
import com.example.sachtruyenoffline.adapter.SachTinhYeuAdapter;
import com.example.sachtruyenoffline.moder.Sach;
import com.example.sachtruyenoffline.moder.SachHoiky;
import com.example.sachtruyenoffline.moder.SachKhoaHoc;
import com.example.sachtruyenoffline.moder.SachKinhDoanh;
import com.example.sachtruyenoffline.moder.SachTinhyeu;

import java.util.ArrayList;
import java.util.List;


public class FrmSach extends Fragment {
    List<Sach> sachList;
    List<SachKhoaHoc> sachListKhoahoc;
    List<SachKinhDoanh> sachKinhDoanhList;
    List<SachTinhyeu> sachTinhyeuList;
    List<SachHoiky> sachHoikyList;

    public FrmSach() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_frm_sach, container, false);

//sách tổng hợp

        sachList = new ArrayList<>();
        sachList.add(new Sach("Đắc nhân tâm", "https://image.slidesharecdn.com/dacnhantam-120819224257-phpapp01/95/c-nhn-tm-1-728.jpg?cb=1345416573"));
        sachList.add(new Sach("Quảng gánh lo đi và vui sống", "http://hitorobook.com/wp-content/uploads/2015/07/quang-ganh-lo-di-va-vui-song.jpg"));
        sachList.add(new Sach("Nơi nào có ý chí, nơi đó có con đường", "http://4.bp.blogspot.com/-AgsceuyfWOY/UTro53pqnvI/AAAAAAAAB1A/KJ6yLWDC9HY/s1600/doko.vn+-+Noi+nao+co+y+chi+noi+do+co+con+duong.jpg"));
        sachList.add(new Sach("Đánh thức con người phi thường trong bạn", "https://bigdream.vn/image/cache/data/book/phat-trien-ban-than/danh-thuc-con-nguoi-phi-thuong-trong-ban-700x1000.jpg"));
        sachList.add(new Sach("Sức mạnh tiềm thức", "https://sachvui.com/cover2/2018/suc-manh-tiem-thuc.jpg"));
        sachList.add(new Sach("Cuốn sách nhỏ cho nhà lãnh đạo lớn", "https://pibook.vn/uploads/products/69974_03_09_15_cuon-sach-nho-cho-nha-lanh-dao-lon.gif"));
        sachList.add(new Sach("Đời thay đổi khi chúng ta thay đổi", "https://www.taisachhay.com/wp-content/uploads/2015/12/doi-thay-doi-khi-chung-ta-thay-doi.jpg"));
        sachList.add(new Sach("Đi tìm lẽ sống", "https://isach.net/wp-content/uploads/2017/07/di-tim-le-song.jpg"));
        sachList.add(new Sach("10 câu nói vạn năng", "https://lovesach.com/wp-content/uploads/2017/11/ebook-10-cau-noi-van-nang-full-prc-pdf-epub-azw3.jpg"));
        sachList.add(new Sach("Trải nghiệm & khát vọng cuộc sống", "https://sachvui.com/cover2/2016/trai-nghiem-va-khat-vong-cuoc-song.jpg"));
        sachList.add(new Sach("Những bài học cuộc sống", "https://muasachhay.vn/wp-content/uploads/2016/09/nhung-bai-hco-cuo-song-mua-sach-hay.jpg"));
        sachList.add(new Sach("Đọc vị bất kỳ ai", "https://www.fahasa.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/8/9/8936117740374_2.jpg"));
        sachList.add(new Sach("Khéo ăn khéo nói sẽ có được thiên hạ", "https://cdn0.fahasa.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/b/i/bia_26_8.jpg"));
        sachList.add(new Sach("Không gì là không thể", "https://www.taisachhay.com/wp-content/uploads/2016/03/you-can-khong-gi-la-khong-the.jpg"));
        sachList.add(new Sach("Đừng đợi đến khi tốt nghiệp đại học", "https://vikwi.com/wp-content/uploads/2016/10/dung_doi_den_khi_tot_nghiep_dai_hoc.jpg"));
        sachList.add(new Sach("Ba người thầy vĩ đại", "https://thaihabooks.com/wp-content/uploads/2017/09/3-ng%C6%B0%E1%BB%9Di-Th%E1%BA%A7y-v%C4%A9-%C4%91%E1%BA%A1i.jpg"));
        sachList.add(new Sach("Người giỏi không phải là người làm tất cả", "http://1.bp.blogspot.com/-q3O0yJxQW2M/VOP2drM7QjI/AAAAAAAAOpU/epCqoqbhjwg/s1600/nguoi-gioi-khong-phai-la-nguoi-lam-tat-ca.jpg"));
        sachList.add(new Sach("Cho là nhận", "https://lovesach.com/wp-content/uploads/2017/11/ebook-cho-la-nhan-full-prc-pdf-epub-azw3.jpg"));
        sachList.add(new Sach("Vị giám đốc 1 phút", "https://3.bp.blogspot.com/-WjflCaiJeg8/Vvp4jKWNvQI/AAAAAAAAAhs/F_JKrp2bHE0TOYV2ApturOiMOM4jrSalg/s1600/ebook-vi-giam-doc-1-phut-va-bi-quyet-xay-dung-nhom-lam-viec-hieu-qua.jpg"));
        sachList.add(new Sach("Kỹ năng buông bỏ", "https://sachvui.com/cover2/2018/ky-nang-buong-bo.jpg"));
        sachList.add(new Sach("Tuổi trẻ đáng giá bao nhiêu","https://www.taisachhay.com/wp-content/uploads/2017/10/tuoi-tre-dang-gia-bao-nhieu.jpg"));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rySach);
        SachAdapter sachAdapter = new SachAdapter(getContext(), sachList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(sachAdapter);


//sách khoa học
        sachListKhoahoc = new ArrayList<>();
        sachListKhoahoc.add(new SachKhoaHoc("Bách khoa cuộc sống", "https://tse1.mm.bing.net/th?id=OIP.vOnPFizx_H6NZHd5-eAT0gHaKv&pid=Api&P=0&w=300&h=300"));
        sachListKhoahoc.add(new SachKhoaHoc("10 vạn câu hỏi vì sao", "https://www.fahasa.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/i/m/image_174095.jpg"));
        sachListKhoahoc.add(new SachKhoaHoc("Bí ẩn của nhân loại", "https://sachvui.com/cover/2016/bi-an-cua-nhan-loai.jpg"));
        sachListKhoahoc.add(new SachKhoaHoc("Lịch sử vạn vật", "http://anybooks.vn/images/book/image/luoc_su_van_vat.jpg"));
        sachListKhoahoc.add(new SachKhoaHoc("Thế giới như thấy tôi", "https://www.netabooks.vn/Data/Sites/1/Product/23112/the-gioi-nhu-toi-thay.jpg"));

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView1 = view.findViewById(R.id.rySachKhoahoc);
        SachKhoaHocAdapter sachAdapter1 = new SachKhoaHocAdapter(getContext(), sachListKhoahoc);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView1.setAdapter(sachAdapter1);

//Sách kinh doanh
        sachKinhDoanhList = new ArrayList<>();
        sachKinhDoanhList.add(new SachKinhDoanh("Cha giầu cha nghèo", "https://sachvui.com/cover/2015/Cha-giau-cha-ngheo.jpg"));
        sachKinhDoanhList.add(new SachKinhDoanh("Đường ra biển lớn", "https://sachvui.com/cover/2016/duong-ra-bien-lon.jpg"));
        sachKinhDoanhList.add(new SachKinhDoanh("Những triệu phú thầm lặng", "https://sachvui.com/cover2/2015/nhung-trieu-phu-tham-lang.jpg"));
        sachKinhDoanhList.add(new SachKinhDoanh("Người bán hàng vĩ đại nhất thế giới", "https://newshop.vn/public/uploads/products/5330/nguoibanhangvidai-nhat-the-gioi.jpg"));
        sachKinhDoanhList.add(new SachKinhDoanh("22 quy luật trong marketing", "https://2.bp.blogspot.com/-0ztefexCQRU/XNwSPEjNznI/AAAAAAAABRw/Mi26_n6iYG8DOaGsXnMYureVshWBlLk5QCLcBGAs/s1600/sach-marketing-22-quy-luat-bat-bien-trong-marketing.png"));
        sachKinhDoanhList.add(new SachKinhDoanh("72 thuật tấn công tâm lý", "https://sachvui.com/cover2/2017/72-thuat-tan-cong-tam-ly-trong-ban-le.jpg"));
        sachKinhDoanhList.add(new SachKinhDoanh("Bí mật tư duy triệu phú", "https://www.taisachhay.com/wp-content/uploads/2016/01/bi-mat-tu-duy-trieu-phu.jpg"));
        sachKinhDoanhList.add(new SachKinhDoanh("Khác biệt hay là chết", "https://2.bp.blogspot.com/-uGtz6BIJdSo/WIhibJrs0VI/AAAAAAAABAk/09m0HkP63780P6vpFZmLWKktpXJpH26LgCLcB/s1600/khac-biet-hay-la-chet-jack-trout.jpg"));
        sachKinhDoanhList.add(new SachKinhDoanh("10 lời khuyên khởi nghiệp", "https://sachvui.com/cover2/2017/10-loi-khuyen-khoi-nghiep.jpg"));
        sachKinhDoanhList.add(new SachKinhDoanh("Tỷ phú bán giày", "https://isach.net/wp-content/uploads/2016/08/ty-phu-ban-giay.jpg"));


        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView2 = view.findViewById(R.id.rySachKinhdoanh);
        SachKinhDoanhAdapter sachAdapter2 = new SachKinhDoanhAdapter(getContext(), sachKinhDoanhList);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setAdapter(sachAdapter2);


        //Sách tình yêu

        sachTinhyeuList = new ArrayList<>();
        sachTinhyeuList.add(new SachTinhyeu("Tán tỉnh bất kỳ ai","https://metaisach.com/wp-content/uploads/2019/05/tan-tinh-bat-ky-ai.jpg"));
        sachTinhyeuList.add(new SachTinhyeu("Luật của trò chơi tình ái","https://tse3.mm.bing.net/th?id=OIP.FfVa5cf3UbHh4XS9wC6rTwAAAA&pid=Api&P=0&w=300&h=300"));
        sachTinhyeuList.add(new SachTinhyeu("Điều kỳ diệu của tình yêu","https://firstnews.com.vn/public/uploads/products/dieu-ky-dieu-cua-tinh-yeu.png"));
        sachTinhyeuList.add(new SachTinhyeu("Bí quyết ứng xử trong tình yêu","https://sachvui.com/cover/2015/bi-quyet-ung-xu-trong-tinh-yeu.jpg"));
        sachTinhyeuList.add(new SachTinhyeu("Làm thế nào để chinh phục đối phương","https://sachvui.com/cover/2017/lam-the-nao-de-chinh-phuc-doi-phuong.jpg"));
        sachTinhyeuList.add(new SachTinhyeu("Gái khôn không bao giờ sợ ế","https://sachvui.com/cover2/2015/Gai-khon-khong-bao-gio-so-e.jpg"));

        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView3 = view.findViewById(R.id.rySachTinhYeu);
        SachTinhYeuAdapter sachTinhYeuAdapter = new SachTinhYeuAdapter(getContext(),sachTinhyeuList);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView3.setAdapter(sachTinhYeuAdapter);



        //Sách hồi ký
        sachHoikyList = new ArrayList<>();
        sachHoikyList.add(new SachHoiky("Cafe cùng Tony","https://bookbuy.vn/Res/Images/Product/ca-phe-cung-tony_29308_1.png"));
        sachHoikyList.add(new SachHoiky("Trên đường băng","https://a.wattpad.com/cover/55105850-352-k252945.jpg"));
        sachHoikyList.add(new SachHoiky("Hà Nội 36 phố phường","https://isach.info/images/story/cover/ha_noi_36_pho_phuong__thach_lam.jpg"));
        sachHoikyList.add(new SachHoiky("Chuyện của lính Tây Nam","https://2.bp.blogspot.com/-bdccUOtmu5s/Wq07t0ZGCRI/AAAAAAAACYw/_dkzsuxaoKkCXi5NjPlKKwmPj3QdChNswCLcBGAs/s1600/chuy%25E1%25BB%2587n%2Bl%25C3%25ADnh%2Bt%25C3%25A2y.jpg"));
        sachHoikyList.add(new SachHoiky("Totto-Chan cô bé bên cửa sổ  ","https://nhanambook.files.wordpress.com/2011/04/tottochan6.jpg"));

        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView4 = view.findViewById(R.id.rySachHoiKy);
        SachHoiKyAdapter sachHoiKyAdapter = new SachHoiKyAdapter(getContext(),sachHoikyList);
        recyclerView4.setLayoutManager(linearLayoutManager4);
        recyclerView4.setAdapter(sachHoiKyAdapter);


        return view;
    }

}

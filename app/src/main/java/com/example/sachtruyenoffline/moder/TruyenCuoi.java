package com.example.sachtruyenoffline.moder;

public class TruyenCuoi {
    public String NameSach;
    public String anh;

    public TruyenCuoi() {
    }

    public TruyenCuoi(String nameSach, String anh) {
        NameSach = nameSach;
        this.anh = anh;
    }

    public String getNameSach() {
        return NameSach;
    }

    public void setNameSach(String nameSach) {
        NameSach = nameSach;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}

package com.example.sachtruyenoffline.moder;

public class Sach {
    public String NameSach;
    public String anh;

    public Sach() {
    }

    public Sach(String nameSach, String anh) {
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

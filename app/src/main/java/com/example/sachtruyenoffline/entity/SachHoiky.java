package com.example.sachtruyenoffline.entity;

public class SachHoiky {
    public  int idName;
    public String NameSach;
    public String anh;
    public String styles;
    public int like;

    public SachHoiky() {
    }

    public SachHoiky(int idName, String nameSach, String anh, int like, String styles) {
        this.idName = idName;
        NameSach = nameSach;
        this.anh = anh;
        this.styles = styles;
        this.like = like;
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

    public int getIdName() {
        return idName;
    }

    public void setIdName(int idName) {
        this.idName = idName;
    }

    public String getStyles() {
        return styles;
    }

    public void setStyles(String styles) {
        this.styles = styles;
    }
    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}

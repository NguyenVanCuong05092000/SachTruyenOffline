package com.example.sachtruyenoffline.moder;

public class MucLuc {
    public String namemuc;
    public String title;

    public MucLuc(String namemuc, String title) {
        this.namemuc = namemuc;
        this.title = title;
    }

    public MucLuc() {
    }

    public String getNamemuc() {
        return namemuc;
    }

    public void setNamemuc(String namemuc) {
        this.namemuc = namemuc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

package com.example.bt5;

public class country {
    private String Ten;
    private String MoTa;
    private int Hinh;

    public country(String ten, String mota,int hinh){
        Ten = ten;
        MoTa = mota;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}


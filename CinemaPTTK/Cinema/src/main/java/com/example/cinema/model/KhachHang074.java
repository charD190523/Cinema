/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

/**
 *
 * @author Admin
 */
public class KhachHang074 extends ThanhVien074{

    public KhachHang074() {
    }

    public KhachHang074(String makh, TheTV074 theTV, ThanhVien074 thanhvien) {
        this.makh = makh;
        this.theTV = theTV;
        this.thanhvien = thanhvien;
    }
    
    
    
    private String makh;
    private TheTV074 theTV;   // Liên kết với class TheTV074
    private ThanhVien074 thanhvien;  // Liên kết với class ThanhVien074

    // Getters và Setters
    public String getMakh() { return makh; }
    public void setMakh(String makh) { this.makh = makh; }

    public TheTV074 getTheTV() { return theTV; }
    public void setTheTV(TheTV074 theTV) { this.theTV = theTV; }

    public ThanhVien074 getThanhVien() { return thanhvien; }
    public void setThanhVien(ThanhVien074 thanhvien) { this.thanhvien = thanhvien; }

    @Override
    public String toString() {
        return "KhachHang074{" + "makh=" + makh + ", theTV=" + theTV + ", thanhvien=" + thanhvien + '}';
    }
    
    
}


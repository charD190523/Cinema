/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

/**
 *
 * @author Admin
 */
import java.util.List;

public class Phong074 {
    private String ten;           // Tên của phòng chiếu
    private int succhua;          // Sức chứa (số ghế) của phòng
    private String mota;          // Mô tả phòng chiếu
    private List<Ghe074> ghe;     // Liên kết với danh sách ghế trong phòng chiếu

    // Getters và Setters
    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public int getSucchua() { return succhua; }
    public void setSucchua(int succhua) { this.succhua = succhua; }

    public String getMota() { return mota; }
    public void setMota(String mota) { this.mota = mota; }

    public List<Ghe074> getGhe() { return ghe; }
    public void setGhe(List<Ghe074> ghe) { this.ghe = ghe; }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

/**
 *
 * @author Admin
 */
public class DoAnGiaoDich074 {
    private int id;
    private int soluong;
    private float tongtien;
    private DoAn074 doan;     // Liên kết với class DoAn074
    private GiaoDich074 giaodich;   // Liên kết với class GiaoDich074

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getSoluong() { return soluong; }
    public void setSoluong(int soluong) { this.soluong = soluong; }

    public float getTongtien() { return tongtien; }
    public void setTongtien(float tongtien) { this.tongtien = tongtien; }

    public DoAn074 getDoan() { return doan; }
    public void setDoan(DoAn074 doan) { this.doan = doan; }

    public GiaoDich074 getGiaodich() { return giaodich; }
    public void setGiaodich(GiaoDich074 giaodich) { this.giaodich = giaodich; }
}


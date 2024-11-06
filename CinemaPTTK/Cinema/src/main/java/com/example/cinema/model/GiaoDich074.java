/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

/**
 *
 * @author Admin
 */
public class GiaoDich074 {
    private int id;
    private String phuongthuc;
    private float tongtien;
    private String ghichu;
    private Ve074 ve;
    private NhanVien074 nv;
    private KhachHang074 kh;

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPhuongthuc() { return phuongthuc; }
    public void setPhuongthuc(String phuongthuc) { this.phuongthuc = phuongthuc; }

    public float getTongtien() { return tongtien; }
    public void setTongtien(float tongtien) { this.tongtien = tongtien; }

    public String getGhichu() { return ghichu; }
    public void setGhichu(String ghichu) { this.ghichu = ghichu; }

    public Ve074 getVe() { return ve; }
    public void setVe(Ve074 ve) { this.ve = ve; }

    public NhanVien074 getNv() { return nv; }
    public void setNv(NhanVien074 nv) { this.nv = nv; }

    public KhachHang074 getKh() { return kh; }
    public void setKh(KhachHang074 kh) { this.kh = kh; }
}


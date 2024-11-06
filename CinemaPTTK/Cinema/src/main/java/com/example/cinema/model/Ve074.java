/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

/**
 *
 * @author Admin
 */
import java.util.Date;

public class Ve074 {
    private int id;
    private float giave;
    private Date ngaymua;     // Lưu trữ ngày mua vé
    private String mota;
    private GheSuatChieu074 gsc;   // Liên kết với class GheSuatChieu074

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public float getGiave() { return giave; }
    public void setGiave(float giave) { this.giave = giave; }

    public Date getNgaymua() { return ngaymua; }
    public void setNgaymua(Date ngaymua) { this.ngaymua = ngaymua; }

    public String getMota() { return mota; }
    public void setMota(String mota) { this.mota = mota; }

    public GheSuatChieu074 getGsc() { return gsc; }
    public void setGsc(GheSuatChieu074 gsc) { this.gsc = gsc; }
}


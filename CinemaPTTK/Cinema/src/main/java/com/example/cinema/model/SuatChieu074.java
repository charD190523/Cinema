/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
import java.util.Date;

public class SuatChieu074 {
    private int id;
    private Date lichchieu;     // Lịch chiếu: Ngày và giờ của suất chiếu
    private String mota;        // Mô tả về suất chiếu
    private Phong074 phong;     // Liên kết với phòng chiếu
    private Phim074 phim;       // Liên kết với phim chiếu trong suất chiếu

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getLichchieu() { return lichchieu; }
    public void setLichchieu(Date lichchieu) { this.lichchieu = lichchieu; }

    public String getMota() { return mota; }
    public void setMota(String mota) { this.mota = mota; }

    public Phong074 getPhong() { return phong; }
    public void setPhong(Phong074 phong) { this.phong = phong; }

    public Phim074 getPhim() { return phim; }
    public void setPhim(Phim074 phim) { this.phim = phim; }
}



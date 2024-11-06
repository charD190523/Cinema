/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

/**
 *
 * @author Admin
 */
public class NhanVien074 {
    private int id;
    private String vitri;     // Vị trí hoặc chức vụ của nhân viên
    private ThanhVien074 thanhvien;  // Liên kết với class ThanhVien074

    public NhanVien074() {
    }

    public NhanVien074(int id, String vitri, ThanhVien074 thanhvien) {
        this.id = id;
        this.vitri = vitri;
        this.thanhvien = thanhvien;
    }
    
    

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getVitri() { return vitri; }
    public void setVitri(String vitri) { this.vitri = vitri; }

    public ThanhVien074 getThanhvien() { return thanhvien; }
    public void setThanhvien(ThanhVien074 thanhvien) { this.thanhvien = thanhvien; }
}


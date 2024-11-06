/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

/**
 *
 * @author Admin
 */
public class GheSuatChieu074 {
    private int id;
    private Ghe074 ghe;       // Liên kết với class Ghe074
    private SuatChieu074 suatchieu;  // Liên kết với class SuatChieu074

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Ghe074 getGhe() { return ghe; }
    public void setGhe(Ghe074 ghe) { this.ghe = ghe; }

    public SuatChieu074 getSuatchieu() { return suatchieu; }
    public void setSuatchieu(SuatChieu074 suatchieu) { this.suatchieu = suatchieu; }
}


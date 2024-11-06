/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

/**
 *
 * @author Admin
 */
public class DiaChi074 {
    private int id;
    private int sonha;
    private String ngo;
    private String duong;
    private String xa;
    private String quan;

    public DiaChi074() {
    }

    public DiaChi074(int id, int sonha, String ngo, String duong, String xa, String quan) {
        this.id = id;
        this.sonha = sonha;
        this.ngo = ngo;
        this.duong = duong;
        this.xa = xa;
        this.quan = quan;
    }
    
    

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getSonha() { return sonha; }
    public void setSonha(int sonha) { this.sonha = sonha; }

    public String getNgo() { return ngo; }
    public void setNgo(String ngo) { this.ngo = ngo; }

    public String getDuong() { return duong; }
    public void setDuong(String duong) { this.duong = duong; }

    public String getXa() { return xa; }
    public void setXa(String xa) { this.xa = xa; }

    public String getQuan() { return quan; }
    public void setQuan(String quan) { this.quan = quan; }

    @Override
    public String toString() {
        return "DiaChi074{" + "id=" + id + ", sonha=" + sonha + ", ngo=" + ngo + ", duong=" + duong + ", xa=" + xa + ", quan=" + quan + '}';
    }
    
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.model;

/**
 *
 * @author Admin
 */
public class TheTV074 {
    private int id;
    private String mathe;     // Thuộc tính mã thẻ
    private float tongdiem;   // Thuộc tính tổng điểm

    public TheTV074() {
    }

    public TheTV074(int id, String mathe, float tongdiem) {
        this.id = id;
        this.mathe = mathe;
        this.tongdiem = tongdiem;
    }
    
    

    // Getters và Setters cho các thuộc tính
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMathe() { return mathe; }
    public void setMathe(String mathe) { this.mathe = mathe; }

    public float getTongdiem() { return tongdiem; }
    public void setTongdiem(float tongdiem) { this.tongdiem = tongdiem; }

    @Override
    public String toString() {
        return "TheTV074{" + "id=" + id + ", mathe=" + mathe + ", tongdiem=" + tongdiem + '}';
    }
    
    
    
}



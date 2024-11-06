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

public class ThanhVien074 {

    private int id;
    private String username;
    private String password;
    private String ho;
    private String tendem;
    private String ten;
    private Date ngaysinh;
    private String email;
    private String sdt;
    private HoTen074 hoten;
    private DiaChi074 addr;

    public ThanhVien074() {
    }

    public ThanhVien074(int id, String username, String password, String ho, String tendem, String ten, Date ngaysinh, String email, String sdt, String ghichu, HoTen074 hoten, DiaChi074 addr) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.email = email;
        this.sdt = sdt;
        this.addr = addr;
    }
    
    

    // Getters và Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHo() { return ho; }
    public void setHo(String ho) { this.ho = ho; }

    public String getTendem() { return tendem; }
    public void setTendem(String tendem) { this.tendem = tendem; }

    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }




    public DiaChi074 getAddr() {
        return addr;
    }

    public void setAddr(DiaChi074 addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "ThanhVien074{" + "id=" + id + ", username=" + username + ", password=" + password + ", ho=" + ho + ", tendem=" + tendem + ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", email=" + email + ", sdt=" + sdt + ", hoten=" + hoten + ", addr=" + addr + '}';
    }
    
    
}

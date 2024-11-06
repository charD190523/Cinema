/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.controller;

/**
 *
 * @author Admin
 */
import com.example.cinema.dao.KHDAO074;
import com.example.cinema.model.DiaChi074;
import com.example.cinema.model.KhachHang074;
import com.example.cinema.model.ThanhVien074;
import com.example.cinema.model.TheTV074;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebServlet("/DangKyThanhVienServlet")
public class DangKyThanhVienServlet extends HttpServlet {
    private KHDAO074 khDAO = new KHDAO074();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String ho = request.getParameter("ho");
        String tendem = request.getParameter("tendem");
        String ten = request.getParameter("ten");
        String email = request.getParameter("email");
        String sdt = request.getParameter("sdt");

        Date ngaysinh = null;
        try {
            String ngaysinhStr = request.getParameter("ngaysinh");
            if (ngaysinhStr != null && !ngaysinhStr.isEmpty()) {
                ngaysinh = new SimpleDateFormat("yyyy-MM-dd").parse(ngaysinhStr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        DiaChi074 diachiObj = new DiaChi074();
        try {
            diachiObj.setSonha(Integer.parseInt(request.getParameter("sonha")));
        } catch (NumberFormatException e) {
            diachiObj.setSonha(0); // Thiết lập giá trị mặc định nếu không chuyển đổi được
        }
        diachiObj.setNgo(request.getParameter("ngo"));
        diachiObj.setDuong(request.getParameter("duong"));
        diachiObj.setXa(request.getParameter("xa"));
        diachiObj.setQuan(request.getParameter("quan"));

        ThanhVien074 thanhVien = new ThanhVien074();
        thanhVien.setUsername(username);
        thanhVien.setPassword(password);
        thanhVien.setHo(ho);
        thanhVien.setTendem(tendem);
        thanhVien.setTen(ten);
        thanhVien.setNgaysinh(ngaysinh);
        thanhVien.setAddr(diachiObj); 
        thanhVien.setEmail(email);
        thanhVien.setSdt(sdt);

        TheTV074 theTV = new TheTV074();
        theTV.setTongdiem(0);

        KhachHang074 khachHang = new KhachHang074();
        khachHang.setThanhVien(thanhVien);
        khachHang.setTheTV(theTV);

        
        System.out.println(khachHang);

        if (khDAO.saveKH(khachHang)) {
            response.getWriter().println("Dang ky thanh cong");
        } else {
            response.getWriter().println("Dang ky that bai, vui long thu lai");
        }
    }
}


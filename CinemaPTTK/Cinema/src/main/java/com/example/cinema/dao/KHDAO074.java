/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cinema.dao;

/**
 *
 * @author Admin
 */
import com.example.cinema.model.DiaChi074;
import com.example.cinema.model.KhachHang074;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KHDAO074 {

    public int saveDiaChi(DiaChi074 diaChi) throws SQLException {
        if (diaChi == null) {
            throw new SQLException("DiaChi074 object is null.");
        }

        String sql = "INSERT INTO DiaChi074 (sonha, ngo, duong, xa, quan) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DAO.getConnection()) {
            if (con == null) {
                throw new SQLException("Failed to establish database connection.");
            }

            try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, diaChi.getSonha());
                ps.setString(2, diaChi.getNgo());
                ps.setString(3, diaChi.getDuong());
                ps.setString(4, diaChi.getXa());
                ps.setString(5, diaChi.getQuan());
                ps.executeUpdate();

                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        return rs.getInt(1); // Trả về ID của địa chỉ vừa được thêm
                    } else {
                        throw new SQLException("Failed to retrieve generated key for DiaChi074.");
                    }
                }
            }
        }
    }

    public boolean saveKH(KhachHang074 kh) {
        System.out.println("Saving KhachHang074: " + kh);

        String sqlThanhVien = "INSERT INTO ThanhVien074 (username, password, ho, tendem, ten, ngaysinh, diachi074ID, email, sdt) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlKhachHang = "INSERT INTO KhachHang074 (maKH, thanhvien074ID) VALUES (?, ?)";
        String sqlTheTV = "INSERT INTO TheTV074 (mathe, tongdiem, khachhang074ID) VALUES (?, ?, ?)";

        try (Connection con = DAO.getConnection()) {
            if (con == null) {
                throw new SQLException("Failed to establish database connection.");
            }

            int diachiId = saveDiaChi(kh.getThanhVien().getAddr());
            System.out.println("Generated diachiId: " + diachiId);

            int thanhVienId;
            try (PreparedStatement psThanhVien = con.prepareStatement(sqlThanhVien, PreparedStatement.RETURN_GENERATED_KEYS)) {
                psThanhVien.setString(1, kh.getThanhVien().getUsername());
                psThanhVien.setString(2, kh.getThanhVien().getPassword());
                psThanhVien.setString(3, kh.getThanhVien().getHo());
                psThanhVien.setString(4, kh.getThanhVien().getTendem());
                psThanhVien.setString(5, kh.getThanhVien().getTen());
                psThanhVien.setDate(6, new java.sql.Date(kh.getThanhVien().getNgaysinh().getTime()));
                psThanhVien.setInt(7, diachiId);
                psThanhVien.setString(8, kh.getThanhVien().getEmail());
                psThanhVien.setString(9, kh.getThanhVien().getSdt());
                psThanhVien.executeUpdate();

                try (ResultSet rs = psThanhVien.getGeneratedKeys()) {
                    if (rs.next()) {
                        thanhVienId = rs.getInt(1);
                        System.out.println("Saved ThanhVien074 with generated ID: " + thanhVienId);
                    } else {
                        throw new SQLException("Failed to retrieve generated key for ThanhVien074.");
                    }
                }
            }

            String maKH = String.format("KH%04d", thanhVienId);

            int khachHangId;
            try (PreparedStatement psKhachHang = con.prepareStatement(sqlKhachHang, PreparedStatement.RETURN_GENERATED_KEYS)) {
                psKhachHang.setString(1, maKH);
                psKhachHang.setInt(2, thanhVienId);
                psKhachHang.executeUpdate();

                try (ResultSet rs = psKhachHang.getGeneratedKeys()) {
                    if (rs.next()) {
                        khachHangId = rs.getInt(1);
                        System.out.println("Saved KhachHang074 with generated ID: " + khachHangId);
                    } else {
                        throw new SQLException("Failed to retrieve generated key for KhachHang074.");
                    }
                }
            }

            String mathe = String.format("theTV%04d", khachHangId);
            try (PreparedStatement psTheTV = con.prepareStatement(sqlTheTV)) {
                psTheTV.setString(1, mathe);
                psTheTV.setFloat(2, kh.getTheTV().getTongdiem());
                psTheTV.setInt(3, khachHangId); // Thiết lập khóa ngoại đến KhachHang074
                psTheTV.executeUpdate();
                System.out.println("Saved TheTV074 with mathe: " + mathe);
            }

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}

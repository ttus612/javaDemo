/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import Entity.NhanVien;
import Entity.PhongBan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class NhanVien_DAO {
    public ArrayList<NhanVien> getAllNhanVien(){
        ArrayList<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
	try {
            ConnectDB.getIntance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "Select * from NhanVien";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
		String maNV = rs.getString("maNV");
		String ho = rs.getString("ho");
		String ten = rs.getString("ten");
		Integer tuoi = rs.getInt("tuoi");
		Boolean phai = rs.getBoolean("phai");
		Double tienLuong = rs.getDouble("tienLuong");
		PhongBan phongBan = new PhongBan(rs.getString("maPhong"));
		NhanVien nv = new NhanVien(maNV, ho, ten, tuoi, phai, tienLuong, phongBan);
		dsNhanVien.add(nv);
            }
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return dsNhanVien;
    }
   //------------------------------THÊM-----------------------------------------
    public void addNV(NhanVien nv) {
	PreparedStatement preparedStatement = null;
        try {
            ConnectDB.getIntance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "insert into NhanVien values(?,?,?,?,?,?,?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, nv.getMaNV());
            preparedStatement.setString(2, nv.getHo());
            preparedStatement.setString(3, nv.getTen());
            preparedStatement.setInt(4, nv.getTuoi());
            preparedStatement.setBoolean(5, nv.isPhai());
            preparedStatement.setString(6, nv.getPhongBan().getMaPhong());
            preparedStatement.setDouble(7, nv.getTienLuong());
            preparedStatement.executeUpdate();
	} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
    } 
    
}



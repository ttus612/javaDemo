/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import Entity.PhongBan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class PhongBan_DAO {
    public ArrayList<PhongBan> getAllPhongBan() {
        ArrayList<PhongBan> dsPhongBan = new ArrayList<PhongBan>();
	try {
            ConnectDB.getIntance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "Select * from PhongBan";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
		String maPhong = rs.getString("maPhong");
		String tenPhong = rs.getString("tenPhong");
		PhongBan pb = new PhongBan(maPhong, tenPhong);
		dsPhongBan.add(pb);
            }
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
	}
	return dsPhongBan;
    }
}

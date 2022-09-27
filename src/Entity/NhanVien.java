/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Objects;

/**
 *
 * @author ACER
 */
public class NhanVien {
    private String maNV;
    private String ho;
    private String ten;
    private int tuoi;
    private boolean phai;
    private double tienLuong;
    private PhongBan phongBan;

    public String getMaNV() {
        return maNV;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public boolean isPhai() {
        return phai;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setPhai(boolean phai) {
        this.phai = phai;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public NhanVien() {
    }

    public NhanVien(String maNV) {
        this.maNV = maNV;
    }

    public NhanVien(String maNV, String ho, String ten, int tuoi, boolean phai, double tienLuong, PhongBan phongBan) {
        this.maNV = maNV;
        this.ho = ho;
        this.ten = ten;
        this.tuoi = tuoi;
        this.phai = phai;
        this.tienLuong = tienLuong;
        this.phongBan = phongBan;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.maNV);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        return Objects.equals(this.maNV, other.maNV);
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", ho=" + ho + ", ten=" + ten + ", tuoi=" + tuoi + ", phai=" + phai + ", tienLuong=" + tienLuong + ", phongBan=" + phongBan + '}';
    }
    
}

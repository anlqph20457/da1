/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author daoqu
 */
public class NhanVien {
    private String id;
    private String tenTK_NV;
    private String MatKhauNV;
    private String HoTen;
    private int GioiTinh;
    private String sdt;
    private Date NgaySinh;
    private String Diachi;
    private int TrangThai;

    public NhanVien() {
    }

    public NhanVien(String id, String tenTK_NV, String MatKhauNV, String HoTen, int GioiTinh, String sdt, Date NgaySinh, String Diachi, int TrangThai) {
        this.id = id;
        this.tenTK_NV = tenTK_NV;
        this.MatKhauNV = MatKhauNV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.sdt = sdt;
        this.NgaySinh = NgaySinh;
        this.Diachi = Diachi;
        this.TrangThai = TrangThai;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenTK_NV() {
        return tenTK_NV;
    }

    public void setTenTK_NV(String tenTK_NV) {
        this.tenTK_NV = tenTK_NV;
    }

    public String getMatKhauNV() {
        return MatKhauNV;
    }

    public void setMatKhauNV(String MatKhauNV) {
        this.MatKhauNV = MatKhauNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

   
   
   
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.util.Date;

/**
 *
 * @author lequy
 */
public class NhanVienViewModel {

    private String Id;
    private String tkNv;
    private String mkNv;
    private String hoTen;
    private Date ngaySinh;
    private int gioiTinh;
    
    private String diaChi;
    private String sdt;
    private float luong;
    private String anh;

    private int trangThai;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String Id, String tkNv, String mkNv, String hoTen, Date ngaySinh, int gioiTinh, String diaChi, String sdt, float luong, String anh, int trangThai) {
        this.Id = Id;
        this.tkNv = tkNv;
        this.mkNv = mkNv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.luong = luong;
        this.anh = anh;
        this.trangThai = trangThai;
    }

    

    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTkNv() {
        return tkNv;
    }

    public void setTkNv(String tkNv) {
        this.tkNv = tkNv;
    }

    public String getMkNv() {
        return mkNv;
    }

    public void setMkNv(String mkNv) {
        this.mkNv = mkNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String Hiengt() {
        if (gioiTinh == 0) {
            return "Nam";
        } else {

            return "Nữ";
        }
    }

    public String hienTrangth() {
        if (trangThai == 0) {
            return "Đi làm";
        } else {
            return "Nghỉ việc";
        }
    }

}

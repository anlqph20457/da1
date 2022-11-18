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
    private int gioiTinh;
    private String sdt;
    private Date ngaySinh;
    private String diaChi;
    private int trangThai;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String Id, String tkNv, String mkNv, String hoTen, int gioiTinh, String sdt, Date ngaySinh, String diaChi, int trangThai) {
        this.Id = Id;
        this.tkNv = tkNv;
        this.mkNv = mkNv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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

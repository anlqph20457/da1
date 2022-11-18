/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daoqu
 */
public class DichVu {
   private String id;
   private String MaDV;
   private String TenDV;
   private int SoLuong;
   private double GiaBan;
   private int DonVi;
   private String Hinh;
   private String DanhMuc;
   private int TrangThai;

    public DichVu() {
    }

    public DichVu(String id, String MaDV, String TenDV, int SoLuong, double GiaBan, int DonVi, String Hinh, String DanhMuc, int TrangThai) {
        this.id = id;
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.DonVi = DonVi;
        this.Hinh = Hinh;
        this.DanhMuc = DanhMuc;
        this.TrangThai = TrangThai;
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daoqu
 */
public class HoaDonChiTiet {
    private HoaDon id_HD;
    private DichVu id_DV;
    private int SoLuong;
    private double DonGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(HoaDon id_HD, DichVu id_DV, int SoLuong, double DonGia) {
        this.id_HD = id_HD;
        this.id_DV = id_DV;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public HoaDon getId_HD() {
        return id_HD;
    }

    public void setId_HD(HoaDon id_HD) {
        this.id_HD = id_HD;
    }

    public DichVu getId_DV() {
        return id_DV;
    }

    public void setId_DV(DichVu id_DV) {
        this.id_DV = id_DV;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }
    
}

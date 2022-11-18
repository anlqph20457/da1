/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daoqu
 */
public class May {
    private String id;
    private KhachHang id_KH;
    private String MaMay;
    private String KhuVuc;
    private double DonGiaMay;

    public May() {
    }

    public May(String id, KhachHang id_KH, String MaMay, String KhuVuc, double DonGiaMay) {
        this.id = id;
        this.id_KH = id_KH;
        this.MaMay = MaMay;
        this.KhuVuc = KhuVuc;
        this.DonGiaMay = DonGiaMay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KhachHang getId_KH() {
        return id_KH;
    }

    public void setId_KH(KhachHang id_KH) {
        this.id_KH = id_KH;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public String getKhuVuc() {
        return KhuVuc;
    }

    public void setKhuVuc(String KhuVuc) {
        this.KhuVuc = KhuVuc;
    }

    public double getDonGiaMay() {
        return DonGiaMay;
    }

    public void setDonGiaMay(double DonGiaMay) {
        this.DonGiaMay = DonGiaMay;
    }
    
}

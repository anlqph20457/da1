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
public class HoaDon {
    private String id;
    private May id_May;
    private NhanVien id_NV;
    private Date TG_BatDau;
    private Date TG_KetThuc;
    private String MaHD;
    private Date NgayTao;

    public HoaDon() {
    }

    public HoaDon(String id, May id_May, NhanVien id_NV, Date TG_BatDau, Date TG_KetThuc, String MaHD, Date NgayTao) {
        this.id = id;
        this.id_May = id_May;
        this.id_NV = id_NV;
        this.TG_BatDau = TG_BatDau;
        this.TG_KetThuc = TG_KetThuc;
        this.MaHD = MaHD;
        this.NgayTao = NgayTao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public May getId_May() {
        return id_May;
    }

    public void setId_May(May id_May) {
        this.id_May = id_May;
    }

    public NhanVien getId_NV() {
        return id_NV;
    }

    public void setId_NV(NhanVien id_NV) {
        this.id_NV = id_NV;
    }

    public Date getTG_BatDau() {
        return TG_BatDau;
    }

    public void setTG_BatDau(Date TG_BatDau) {
        this.TG_BatDau = TG_BatDau;
    }

    public Date getTG_KetThuc() {
        return TG_KetThuc;
    }

    public void setTG_KetThuc(Date TG_KetThuc) {
        this.TG_KetThuc = TG_KetThuc;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }
    
}

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
public class DatMay {
    private String id;
    private May id_May;
    private String MaKHDatMay;
    private String HoTen;
    private Date NgayDat;

    public DatMay() {
    }

    public DatMay(String id, May id_May, String MaKHDatMay, String HoTen, Date NgayDat) {
        this.id = id;
        this.id_May = id_May;
        this.MaKHDatMay = MaKHDatMay;
        this.HoTen = HoTen;
        this.NgayDat = NgayDat;
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

    public String getMaKHDatMay() {
        return MaKHDatMay;
    }

    public void setMaKHDatMay(String MaKHDatMay) {
        this.MaKHDatMay = MaKHDatMay;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(Date NgayDat) {
        this.NgayDat = NgayDat;
    }
    
}

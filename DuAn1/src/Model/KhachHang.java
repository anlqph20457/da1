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
public class KhachHang {
    private String id;
    private UuDai id_Ud;
    private String TaiKhoanKH;
    private String MatKhauKH;
    private String HoTen;
    private String Sdt;
    private Date NgayDangKi;

    public KhachHang() {
    }

    public KhachHang(String id, UuDai id_Ud, String TaiKhoanKH, String MatKhauKH, String HoTen, String Sdt, Date NgayDangKi) {
        this.id = id;
        this.id_Ud = id_Ud;
        this.TaiKhoanKH = TaiKhoanKH;
        this.MatKhauKH = MatKhauKH;
        this.HoTen = HoTen;
        this.Sdt = Sdt;
        this.NgayDangKi = NgayDangKi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UuDai getId_Ud() {
        return id_Ud;
    }

    public void setId_Ud(UuDai id_Ud) {
        this.id_Ud = id_Ud;
    }

    public String getTaiKhoanKH() {
        return TaiKhoanKH;
    }

    public void setTaiKhoanKH(String TaiKhoanKH) {
        this.TaiKhoanKH = TaiKhoanKH;
    }

    public String getMatKhauKH() {
        return MatKhauKH;
    }

    public void setMatKhauKH(String MatKhauKH) {
        this.MatKhauKH = MatKhauKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public Date getNgayDangKi() {
        return NgayDangKi;
    }

    public void setNgayDangKi(Date NgayDangKi) {
        this.NgayDangKi = NgayDangKi;
    }
    
}

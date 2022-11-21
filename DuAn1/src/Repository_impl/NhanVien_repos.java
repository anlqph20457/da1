/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository_impl;

import Model.NhanVien;
import Repository.INhanVien_repos;
import Ulti.JDBC_Helper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author lequy
 */
public class NhanVien_repos implements INhanVien_repos{

    @Override
    public List<NhanVien> getALllNV() {
      List<NhanVien> list = new ArrayList<>();
      String sql ="SELECT ID,TenTK,MatKhau,HoTen,NgaySinh,GioiTinh,DiaChi,Sdt,Luong,Hinh,TrangThai FROM NhanVien";
      ResultSet rs = JDBC_Helper.Query(sql);
      
        try {
            while (rs.next()) {                
                NhanVien nv = new NhanVien(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                rs.getDate(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getFloat(9),rs.getString(10),rs.getInt(11));
                list.add(nv);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public NhanVien getNVByMa(String ma) {
        NhanVien nhanv = null;
       String sql = "SELECT ID,MatKhau,HoTen,NgaySinh,GioiTinh,DiaChi,Sdt,Luong,Hinh,TrangThai FROM NhanVien WHERE TenTK =";
       ResultSet rs = JDBC_Helper.Query(sql,ma);
        try {
            while (rs.next()) {                
                nhanv = new NhanVien(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                rs.getDate(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getFloat(9),rs.getString(10),rs.getInt(11));  
            }
            return nhanv;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<NhanVien> findNV(String keyWord) {
        List<NhanVien> list = new ArrayList<>();
       String sql  ="SELECT MatKhau,HoTen,NgaySinh,GioiTinh,DiaChi,Sdt,Luong,Hinh,TrangThai FROM NhanVien WHERE TenTK LIKE '%"+keyWord+ "%'";
        ResultSet rs = JDBC_Helper.Query(sql,keyWord);
      
        try {
            while (rs.next()) {                
                NhanVien nv = new NhanVien(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                rs.getDate(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getFloat(9),rs.getString(10),rs.getInt(11));
                list.add(nv);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public int add(NhanVien nv) {
        String sql = "INSERT INTO NhanVien(TenTK,MatKhau,HoTen,NgaySinh,GioiTinh,DiaChi,Sdt,Luong,Hinh,TrangThai)VALUES(?,?,?,?,?,?,?,?,?,?);";
        return JDBC_Helper.Update(sql,nv.getTenTK_NV(),nv.getMatKhauNV(),nv.getHoTen(),nv.getNgaySinh(),nv.getGioiTinh(),nv.getDiachi(),nv.getSdt()
        ,nv.getLuong(),nv.getAnh(),nv.getTrangThai());
    }

    @Override
    public int delete(NhanVien nv) {
       String sql = "DELETE FROM NhanVien WHERE TenTK = ? ";
       return JDBC_Helper.Update(sql,nv.getTenTK_NV());
    }

    @Override
    public int update(NhanVien nv) {
   String sql = "UPDATE NHANVIEN SET MatKhau = ? , HoTen  = ?, Ngaysinh = ?, GioiTinh = ?,DiaChi =  ?, Sdt = ?,Luong=?,Hinh = ?,TrangThai = ? WHERE TenTK = ?";
    return JDBC_Helper.Update(sql, nv.getMatKhauNV(),nv.getHoTen(),nv.getNgaySinh(),nv.getGioiTinh(),nv.getDiachi(),nv.getSdt()
        ,nv.getLuong(),nv.getAnh(),nv.getTrangThai(),nv.getTenTK_NV());
    
    }
    
}

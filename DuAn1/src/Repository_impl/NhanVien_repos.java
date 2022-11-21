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
      String sql ="SELECT ID,TENTK_NV,MATKHAUNV,HOTEN,GIOITINH,SDT,NGAYSINH,DIACHI,TRANGTHAI FROM NHANVIEN";
      ResultSet rs = JDBC_Helper.Query(sql);
      
        try {
            while (rs.next()) {                
                NhanVien nv = new NhanVien(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)
                    ,rs.getString(8),rs.getInt(9));
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
       String sql = "SELECT ID,MATKHAUNV,HOTEN,GIOITINH,SDT,NGAYSINH,DIACHI,TRANGTHAI FROM NHANVIEN WHERE TENTK_NV  = ?";
       ResultSet rs = JDBC_Helper.Query(sql,ma);
        try {
            while (rs.next()) {                
                nhanv = new NhanVien(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)
                    ,rs.getString(8),rs.getInt(9));  
            }
            return nhanv;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<NhanVien> findNV(String keyWord) {
        List<NhanVien> list = new ArrayList<>();
       String sql  ="SELECT ID,MATKHAUNV,HOTEN,GIOITINH,SDT,NGAYSINH,DIACHI,TRANGTHAI FROM NHANVIEN WHERE TenTK_NV LIKE '%"+keyWord+ "%'";
        ResultSet rs = JDBC_Helper.Query(sql,keyWord);
      
        try {
            while (rs.next()) {                
                NhanVien nv = new NhanVien(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)
                    ,rs.getString(8),rs.getInt(9));
                list.add(nv);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public int add(NhanVien nv) {
        String sql = "INSERT INTO NhanVien (TenTK_NV,MatKhauNV,HoTen,GioiTinh,Sdt,NgaySinh,Diachi,TrangThai)  VALUES (?,?,?,?,?,?,?,?)";
        return JDBC_Helper.Update(sql, nv.getTenTK_NV(),nv.getMatKhauNV(),nv.getHoTen(),nv.getGioiTinh(),
               nv.getSdt(),nv.getNgaySinh(),nv.getDiachi(),nv.getTrangThai());
    }

    @Override
    public int delete(NhanVien nv) {
       String sql = "DELETE FROM NhanVien WHERE TenTK_NV = ? ";
       return JDBC_Helper.Update(sql,nv.getTenTK_NV());
    }

    @Override
    public int update(NhanVien nv) {
   String sql = "UPDATE NHANVIEN SET MatKhauNV = ? , HoTen  = ? , GioiTinh = ? , Sdt = ? ,NgaySinh = ? , Diachi = ?,TrangThai = ? WHERE TenTK_NV = ?";
    return JDBC_Helper.Update(sql, nv.getMatKhauNV(),nv.getHoTen(),nv.getGioiTinh(),nv.getSdt(),nv.getNgaySinh(),
            nv.getDiachi(),nv.getTrangThai(),nv.getTenTK_NV());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.NhanVien;
import java.util.List;

/**
 *
 * @author hung duong
 */
public interface INhanVien_repos {

    List<NhanVien> getALllNV();

    NhanVien getNVByMa(String ma);

    List<NhanVien> findNV(String keyWord);

    int add(NhanVien nv);

    int delete(NhanVien nv);

    int update(NhanVien nv);
}

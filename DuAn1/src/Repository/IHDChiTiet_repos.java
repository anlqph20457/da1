/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author hung duong
 */
public interface IHDChiTiet_repos {

    List<HoaDonChiTiet> getAllHDCT();

    HoaDonChiTiet getHDCTByMa(String ma);

    int add(HoaDonChiTiet hd);

    int delete(HoaDonChiTiet hd);

    int update(HoaDonChiTiet hd);
}
